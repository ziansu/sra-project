@java.lang.Override
public void execute() {
    loginWindow.dispose();
    final client.main.Catan GameWindow = new client.main.Catan();
    playerWaitingController.start();
}