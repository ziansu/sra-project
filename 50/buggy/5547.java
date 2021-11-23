public static java.util.ArrayList<java.lang.String> getProcNames() {
    java.util.ArrayList<java.lang.String> procNames;
    GHealthClient.clientUI.handleMessageFromClientGUI("procs");
    procNames = ((java.util.ArrayList<java.lang.String>) (GHealthClient.clientUI.getMessage()));
    return procNames;
}