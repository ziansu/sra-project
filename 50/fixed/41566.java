@java.lang.Override
public void onReturnValue(com.oracle.truffle.api.instrumentation.EventContext context, com.oracle.truffle.api.frame.VirtualFrame frame, java.lang.Object result) {
    if (!(disabled())) {
        com.oracle.truffle.api.CompilerDirectives.transferToInterpreter();
        returnCleanup(frame, false);
    }
}