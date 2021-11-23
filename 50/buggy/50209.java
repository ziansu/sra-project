@org.junit.Before
public void setUp() {
    textArea = new javax.swing.JTextArea();
    java.io.PrintStream printStream = new java.io.PrintStream(new org.jboss.aesh.mterm.util.MtermOutputStream(textArea));
    java.lang.System.setOut(printStream);
    aesh = AeshUtil.INSTANCE;
    aesh.start(printStream);
}