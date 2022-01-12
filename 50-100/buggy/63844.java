@java.lang.SuppressWarnings(value = { "PMD.ProhibitPublicStaticMethods" , "PMD.AvoidDuplicateLiterals" })
public static void mutateConnectionMultiplyGaussian(final org.eann.sim.simulation.neuronalnet.NeuronalNetwork brain) {
    final double[][] connectionWeights = brain.getConnectionWeights();
    final int[] weightPos = org.eann.sim.simulation.neuronalnet.MutationUtils.pickRandomConnection(brain);
    final double weight = connectionWeights[weightPos[0]][weightPos[1]];
    final double multiply = 1 + (org.eann.sim.simulation.neuronalnet.MutationUtils.random.nextGaussian());
    connectionWeights[weightPos[0]][weightPos[1]] = weight * multiply;
    brain.setConnectionWeights(connectionWeights);
}