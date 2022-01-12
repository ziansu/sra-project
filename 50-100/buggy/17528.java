private void changeStateOfControlModuleGroup(int groupNumber, boolean turnOn) {
    byte opCode = (turnOn == true) ? WHCSOpCodes.TURN_ON_MODULE : WHCSOpCodes.TURN_OFF_MODULE;
    com.whcs_ucf.whcs_android.DatabaseHandler dbHandler = new com.whcs_ucf.whcs_android.DatabaseHandler(this.getApplicationContext());
    java.util.ArrayList<com.whcs_ucf.whcs_android.ControlModuleGrouping> controlModuleGroup = dbHandler.getControlModuleGroup(groupNumber);
    for (com.whcs_ucf.whcs_android.ControlModuleGrouping grouping : controlModuleGroup) {
        if ((controlModuleAdapter.getItem(grouping.getControlModuleId())) instanceof com.whcs_ucf.whcs_android.ToggleableControlModule) {
            sendOutOnOffCommandToListedControlModule(opCode, grouping.getControlModuleId());
        }
    }
}