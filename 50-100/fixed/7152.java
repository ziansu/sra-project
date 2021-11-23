public static void main(java.lang.String[] args) {
    Interpolation interpolation = new Interpolation();
    double second = interpolation.secondOrder();
    double third = interpolation.thirdOrder();
    java.lang.System.out.println(("Second order value : " + second));
    java.lang.System.out.println(("Third order value : " + third));
    double error = ((double) (third)) - second;
    java.lang.System.out.println(("Error : " + error));
}