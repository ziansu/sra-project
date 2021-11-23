protected org.apache.karaf.shell.console.jline.Console createConsole(org.apache.felix.gogo.runtime.CommandProcessorImpl commandProcessor, java.io.InputStream in, java.io.PrintStream out, java.io.PrintStream err, jline.Terminal terminal) throws java.lang.Exception {
    return new org.apache.karaf.shell.console.jline.Console(commandProcessor, in, out, err, terminal, "UTF-8", null);
}