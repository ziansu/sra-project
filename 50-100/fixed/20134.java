public static void main(java.lang.String[] args) {
    commonGUI.ICommonGUI commonGui = new commonGUI.CommonGUI();
    new java.lang.Thread(commonGui).start();
    commonGui.drawImage("initialising.jpg");
    ITransmitter testTransmitter = new BTTransmitter();
    IMotorController motorController = new MotorController(testTransmitter, commonGui);
    algorithm.IRoutingController routingController = new algorithm.RoutingController(motorController, commonGui);
    image.IIRController findBallsController = new image.IRControllerB(routingController, commonGui);
    findBallsController.startTracking();
}