@java.lang.Override
public double calculateFitness(double[] solutionVector) throws java.lang.Exception {
    if ((solutionVector.length) == (numDimensions)) {
        double x = solutionVector[0];
        java.lang.Double result = 0.0;
        for (int j = 0; j < (Nx); j++) {
            for (int i = 0; i < j; i++) {
                result += java.lang.Math.pow(solutionVector[i], 2.0);
            }
        }
        return result;
    }else
        throw new java.lang.Exception("Invalid input variables for problem.");
    
}