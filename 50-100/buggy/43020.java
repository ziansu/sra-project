@org.junit.Test
public void testNextDistribution() {
    final org.terasology.markovChains.RawMarkovChain rawMarkovChain = new org.terasology.markovChains.RawMarkovChain(org.terasology.markovChains.TestUtilities.randomTransitionMatrix(3, 4));
    rawMarkovChain.getTransitionMatrix().normalize();
    final int nrOfSamples = 1000;
    nextDistributionTest(rawMarkovChain, nrOfSamples, 0, 0, 0);
    nextDistributionTest(rawMarkovChain, nrOfSamples, 1, 3, 2);
    nextDistributionTest(rawMarkovChain, nrOfSamples, 3, 2, 2);
    nextDistributionTest(rawMarkovChain, nrOfSamples, 3, 3, 3);
}