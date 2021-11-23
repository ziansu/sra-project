@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
public static void handleArgumentError(java.lang.Object arg, com.oracle.truffle.r.runtime.nodes.RBaseNode callObj, com.oracle.truffle.r.runtime.RError.Message message, java.lang.Object[] messageArgs) {
    if ((com.oracle.truffle.r.runtime.context.RContext.getInstance()) == null) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format(message.message, com.oracle.truffle.r.nodes.builtin.CastBuilder.substituteArgPlaceholder(arg, messageArgs)));
    }else {
        throw com.oracle.truffle.r.runtime.RError.error(callObj, message, com.oracle.truffle.r.nodes.builtin.CastBuilder.substituteArgPlaceholder(arg, messageArgs));
    }
}