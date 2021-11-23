public static double[] nearLocationString(java.lang.String nearLocationStr) {
    nearLocationStr.replace("(", "");
    nearLocationStr.replace(")", "");
    java.lang.String[] locationStr = nearLocationStr.split(",");
    return new double[]{ java.lang.Double.valueOf(locationStr[0].trim()) , java.lang.Double.valueOf(locationStr[1].trim()) };
}