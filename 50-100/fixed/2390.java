public static void unixProcessCleanup(java.lang.String requestId) throws java.io.IOException {
    java.util.ArrayList<java.lang.String> command = new java.util.ArrayList<>();
    command.add("pkill");
    command.add("-f");
    command.add(requestId);
    new SOMANETconnect.systemprocess.SystemProcess(command);
    command.add(1, "-9");
    new SOMANETconnect.systemprocess.SystemProcess(command);
}