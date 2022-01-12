public final java.lang.Object callDirect(java.lang.Object... args) {
    getCompilationProfile().profileDirectCall(this, args);
    try {
        java.lang.Object result = doInvoke(args);
        if (com.oracle.truffle.api.CompilerDirectives.inCompiledCode()) {
            result = this.compilationProfile.injectReturnValueProfile(result);
        }
        return result;
    } catch (java.lang.Throwable t) {
        throw com.oracle.graal.truffle.OptimizedCallTarget.rethrow(compilationProfile.profileExceptionType(t));
    }
}