public static void main(java.lang.String[] args) {
    com.codegen.util.ShellComandInvoker obj = new com.codegen.util.ShellComandInvoker();
    java.lang.String domainName = "google.com";
    java.lang.String command = "ping -c 3 " + domainName;
    java.lang.String output = obj.executeCommand(command);
    java.lang.System.out.println(output);
}