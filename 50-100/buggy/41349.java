@java.lang.Override
public it.unibo.alchemist.model.interfaces.TimeDistribution<java.lang.Double> createTimeDistribution(final org.apache.commons.math3.random.RandomGenerator rand, final it.unibo.alchemist.model.interfaces.Environment<java.lang.Double> env, final it.unibo.alchemist.model.interfaces.Node<java.lang.Double> node, final java.lang.String param) {
    try {
        final double rate = java.lang.Double.parseDouble(param);
        return new it.unibo.alchemist.model.implementations.timedistributions.ExponentialTime(rate, rand);
    } catch (java.lang.NumberFormatException e) {
        return new it.unibo.alchemist.model.implementations.timedistributions.ExponentialTime(1.0, rand);
    }
}