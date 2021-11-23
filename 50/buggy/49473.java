public static org.eclipse.ui.console.IOConsoleOutputStream getOutputStream() {
    org.eclipse.ui.console.IOConsoleOutputStream outputStream = org.talend.designer.esb.runcontainer.util.RuntimeConsoleUtil.findConsole(org.talend.designer.esb.runcontainer.util.RuntimeConsoleUtil.KARAF_CONSOLE).newOutputStream();
    outputStream.setEncoding(java.lang.System.getProperty("sun.jnu.encoding", "UTF-8"));
    return outputStream;
}