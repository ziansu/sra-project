public static java.util.ArrayList<java.lang.String> getProcNames() {
    java.util.ArrayList<java.lang.String> procNames;
    java.lang.String msg = "procs";
    GHealthClient.clientUI.handleMessageFromClientGUI(msg);
    procNames = ((java.util.ArrayList<java.lang.String>) (GHealthClient.clientUI.getMessage()));
    return procNames;
}