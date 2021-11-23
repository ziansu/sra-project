public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.zalas.traffic.dynamic.ui.Launcher launcher = new com.zalas.traffic.dynamic.ui.Launcher();
    java.lang.System.out.println("Creating network");
    launcher.createPredictors();
    java.lang.System.out.println("Testing network");
    launcher.testPredictors();
}