public java.lang.String getWebAppName(java.lang.String testName) {
    java.util.Random random = new java.util.Random();
    int randomVal = java.lang.Math.abs(random.nextInt(1000000));
    return ((((getCFTAppPrefix()) + '_') + testName) + '_') + randomVal;
}