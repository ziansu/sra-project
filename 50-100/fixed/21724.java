private void init_theta(Jama.Matrix theta) {
    java.util.Random randomNumGen = new java.util.Random();
    int rand_bound = 1000;
    for (int i = 0; i < (theta.getRowDimension()); i++) {
        double thetaVal = ((double) ((randomNumGen.nextInt(rand_bound)) + 1));
        theta.set(i, 0, 0);
    }
    java.lang.System.out.println("initial theta: ");
    theta.print(new java.text.DecimalFormat(Constants.NUMBER_FORMAT), 5);
}