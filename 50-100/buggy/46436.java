private static void TestJmri() {
    java.lang.String serialPort = "/dev/ttyUSB0";
    java.lang.String prefix = "L";
    int switchNumber = 43;
    com.traintrax.navigation.service.TrainNavigationServiceInterface trainNavigationServiceInterface = null;
    trainNavigationServiceInterface = new com.traintrax.navigation.service.TrainNavigationService();
    try {
        trainNavigationServiceInterface.SetSwitchState("SW43", SwitchState.Pass);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}