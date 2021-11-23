@java.lang.Override
public double calculateFitness(double[] solutionVector) throws java.lang.Exception {
    if ((solutionVector.length) == (numDimensions)) {
        double x = solutionVector[0];
        return ((30.0 + (25.0 * x)) - (4.0 * (java.lang.Math.pow(x, 2.0)))) + (0.15 * (java.lang.Math.pow(x, 3.0)));
    }else
        throw new java.lang.Exception("Invalid input variables for problem.");
    
}