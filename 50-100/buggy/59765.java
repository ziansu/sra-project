@org.junit.Test
public void getGenome() throws java.lang.Exception {
    us.kbase.kbasegenefamilies.test.Genome genome = null;
    java.lang.System.out.println("Reading genome from WS");
    us.kbase.kbasegenefamilies.test.WorkspaceClient wc = us.kbase.kbasegenefamilies.test.SelfAssembledTest.createWsClient(us.kbase.kbasegenefamilies.test.SelfAssembledTest.getDevToken());
    genome = wc.getObjects(java.util.Arrays.asList(new us.kbase.kbasegenefamilies.test.ObjectIdentity().withRef(us.kbase.kbasegenefamilies.test.SelfAssembledTest.genomeRef))).get(0).getData().asClassInstance(us.kbase.kbasegenefamilies.test.Genome.class);
    java.lang.System.out.println(genome.getScientificName());
    assertEquals(genome.getScientificName(), "c c c");
}