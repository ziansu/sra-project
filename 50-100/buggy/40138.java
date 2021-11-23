public void debugStacktrace() {
    if (!(com.pieisnotpi.engine.PiEngine.debug))
        return ;
    
    java.lang.StackTraceElement[] stack = java.lang.Thread.currentThread().getStackTrace();
    err("Printing stack trace");
    for (int i = 2; i < (stack.length); i++) {
        java.lang.System.err.printf(("\tat %s%n" + (stack[i])));
    }
}