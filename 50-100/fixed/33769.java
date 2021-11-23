@java.lang.Override
protected void onStart() {
    try {
        if (!(com.pizz.wifibotcontroller.ControllerSingleton.getCommandSender().isConnected())) {
            com.pizz.wifibotcontroller.ControllerSingleton.getCommandSender().openConnection();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
        finish();
    }
    super.onStart();
}