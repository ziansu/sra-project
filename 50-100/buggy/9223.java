public static void main(java.lang.String[] args) {
    if ((args.length) != 3) {
        java.lang.System.out.println("Usage: java RidgeRegression <dataDir> <lambda> <power>");
        java.lang.System.out.println("Example: java RidgeRegression ../../data/sinData_Train.csv 0.2 5");
        java.lang.System.exit(0);
    }
    RidgeRegression.init(args);
    FileParser.readData(RidgeRegression.fileDir, ",", RidgeRegression.allData, RidgeRegression.allLabels, RidgeRegression.POWER);
    FileParser.center(RidgeRegression.allData);
    RidgeRegression.run();
}