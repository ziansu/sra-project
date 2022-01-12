@com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
private int call(java.lang.String command, java.lang.String[] arguments, java.lang.String[] environmentVariables, java.util.Collection<jnr.posix.SpawnFileAction> fileActions) {
    return getContext().getNativePlatform().getPosix().posix_spawnp(command, fileActions, java.util.Arrays.asList(arguments), java.util.Arrays.asList(environmentVariables));
}