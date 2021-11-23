@org.junit.Test
public void testGetInnovationID() {
    int indexOfTest = 0;
    java.util.ArrayList<edu.utexas.cs.nn.evolution.genotypes.TWEANNGenotype.LinkGene> newLinks = new java.util.ArrayList<edu.utexas.cs.nn.evolution.genotypes.TWEANNGenotype.LinkGene>();
    hcppn.loopThroughLinks(newLinks, cppn, indexOfTest, subs.get(edu.utexas.cs.nn.evolution.genotypes.HyperNEATCPPNGenotypeTest.sub1Index), subs.get(edu.utexas.cs.nn.evolution.genotypes.HyperNEATCPPNGenotypeTest.sub2Index), edu.utexas.cs.nn.evolution.genotypes.HyperNEATCPPNGenotypeTest.sub1Index, edu.utexas.cs.nn.evolution.genotypes.HyperNEATCPPNGenotypeTest.sub2Index, subs);
}