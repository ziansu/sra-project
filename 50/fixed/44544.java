private void printHelp(final java.lang.String message) {
    java.lang.System.out.println((("\n-----------------------\n" + message) + "\n-----------------------\n"));
    final org.apache.commons.cli.HelpFormatter formatter = new org.apache.commons.cli.HelpFormatter();
    formatter.printHelp("Running Import/Export Utility", cmdOptions);
    throw new java.lang.RuntimeException(message);
}