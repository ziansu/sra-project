private void dispatchCommandForConfig(models.ctrlCommand.CTRLCommand thisCmd) {
    java.lang.System.out.println(("Command requesting config: " + (thisCmd.hashCode())));
    try {
        thisCmd.configure(currentState);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}