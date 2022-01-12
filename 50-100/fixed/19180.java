@org.junit.Test
public void testAddAllGenome() {
    java.lang.String[] genomes = new java.lang.String[]{ "1" , "2" };
    n.addAllGenome(genomes);
    java.util.List<java.lang.String> expectedGenomes = new java.util.ArrayList<java.lang.String>();
    expectedGenomes.add(genomes[0]);
    expectedGenomes.add(genomes[1]);
    org.junit.Assert.assertEquals(expectedGenomes, n.getGenomes());
}