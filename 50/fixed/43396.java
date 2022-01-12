public static void main(java.lang.String[] arguis) {
    timeCountingMachine.FileManager.saveData();
    timeCountingMachine.Main.userData = timeCountingMachine.FileManager.loadUserData();
    timeCountingMachine.ShowFrame showFrame = new timeCountingMachine.ShowFrame();
    timeCountingMachine.ControlFrame ctrlFrame = new timeCountingMachine.ControlFrame();
}