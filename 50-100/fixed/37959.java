private static void setPortIfStatedAsParameter(java.lang.String[] args) {
    for (java.lang.String arg : args) {
        if (arg.contains("=")) {
            if (arg.split("=")[0].toLowerCase().equals("port")) {
                java.lang.Integer port = java.lang.Integer.valueOf(arg.split("=")[1]);
                java.lang.System.out.println((("Setting server port to " + port) + "."));
                Settings.port = port;
            }
        }
    }
}