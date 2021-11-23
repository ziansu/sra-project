@java.lang.Override
public void println(java.lang.String arg0) {
    messages.debugUser(("R:" + arg0), getClass());
}