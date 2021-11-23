private void dispatchCommandForConfig(models.ctrlCommand.CTRLCommand thisCmd) {
    try {
        thisCmd.configure(currentState);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}