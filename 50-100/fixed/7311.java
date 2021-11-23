public final java.lang.Object callDirect(java.lang.Object... args) {
    try {
        getCompilationProfile().profileDirectCall(this, args);
        java.lang.Object result = doInvoke(args);
        if (com.oracle.truffle.api.CompilerDirectives.inCompiledCode()) {
            result = compilationProfile.injectReturnValueProfile(result);
        }
        return result;
    } catch (java.lang.Throwable t) {
        throw com.oracle.graal.truffle.OptimizedCallTarget.rethrow(compilationProfile.profileExceptionType(t));
    }
}