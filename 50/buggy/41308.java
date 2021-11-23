public void setup() {
    java.lang.System.out.println(util.ExecuteShellCommand.executeCommand("stty", "-echo"));
    java.lang.System.out.println(util.ExecuteShellCommand.executeCommand("printf", "-e", ((("\\e[8;" + (height)) + ";") + (width))));
}