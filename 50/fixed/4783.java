@java.lang.Override
public void println(java.lang.String arg0) {
    if ((messages) != null)
        messages.debugUser(("R:" + arg0), getClass());
    
}