@java.lang.SuppressWarnings(value = { "PMD.ProhibitPublicStaticMethods" , "PMD.AvoidDuplicateLiterals" })
public static void mutateConnectionAddGaussian(final org.eann.sim.simulation.neuronalnet.NeuronalNetwork brain) {
    final double[][] connectionWeights = brain.getConnectionWeights();
    final int[] weightPos = org.eann.sim.simulation.neuronalnet.MutationUtils.pickRandomConnection(connectionWeights);
    final double weight = connectionWeights[weightPos[0]][weightPos[1]];
    connectionWeights[weightPos[0]][weightPos[1]] = weight + (org.eann.sim.simulation.neuronalnet.MutationUtils.random.nextGaussian());
    brain.setConnectionWeights(connectionWeights);
}