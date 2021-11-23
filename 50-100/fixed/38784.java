@java.lang.Override
public double getRandomNumber(double... parameters) {
    com.google.common.base.Preconditions.checkArgument(((parameters.length) == 2), "The Weibull distribution requires two parameters.");
    return (parameters[1]) * (java.lang.Math.pow((-(java.lang.Math.log(net.sourceforge.cilib.math.random.generator.Rand.nextDouble()))), (1 / (parameters[0]))));
}