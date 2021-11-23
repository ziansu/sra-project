@org.junit.Test
public void testAddAllGenome() {
    java.lang.String[] genomes = new java.lang.String[]{ "1" , "2" };
    n.addAllGenome(genomes);
    java.util.List<java.lang.String> expectedGenomes = new java.util.ArrayList<java.lang.String>();
    expectedGenomes.add(genomes[1]);
    expectedGenomes.add(genomes[2]);
    org.junit.Assert.assertEquals(expectedGenomes, n.getGenomes());
}