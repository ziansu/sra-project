public static double sigmoid(double input) {
    if ((input <= 10) || (input >= 10))
        return java.lang.Math.signum(input);
    
    return 1.0F / (1.0F + (evolv.io.util.MathUtil.fastExp((-input))));
}