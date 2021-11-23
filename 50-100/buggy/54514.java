@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
public static void handleArgumentWarning(java.lang.Object arg, com.oracle.truffle.r.runtime.nodes.RBaseNode callObj, com.oracle.truffle.r.runtime.RError.Message message, java.lang.Object[] messageArgs) {
    if (message == null) {
        return ;
    }
    if ((com.oracle.truffle.r.runtime.context.RContext.getInstance()) == null) {
        java.lang.System.err.println(java.lang.String.format(message.message, com.oracle.truffle.r.nodes.builtin.CastBuilder.substituteArgPlaceholder(arg, messageArgs)));
    }else {
        com.oracle.truffle.r.runtime.RError.warning(callObj, message, com.oracle.truffle.r.nodes.builtin.CastBuilder.substituteArgPlaceholder(arg, messageArgs));
    }
}