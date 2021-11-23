public static java.lang.Class $noinline$inlineCache3(Main m, boolean isSecondInvocation) {
    if (!(Main.isInInterpreter("$noinline$inlineCache3"))) {
        return SubMain.class;
    }
    Main.ensureHasProfilingInfo("$noinline$inlineCache3");
    if (isSecondInvocation) {
        Main.ensureHasOsrCode("$noinline$inlineCache3");
    }
    Main other = m.inlineCache3();
    if (isSecondInvocation) {
        while (!(Main.isInOsrCode("$noinline$inlineCache3"))) {
        } 
    }
    return other == null ? null : other.returnClass();
}