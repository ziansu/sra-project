public static com.aol.cyclops.control.Matchable.MXor<java.lang.Throwable, com.aol.cyclops.react.SimpleReactFailedStageException> matchable(final java.lang.Throwable t) {
    final com.aol.cyclops.control.Xor<java.lang.Throwable, com.aol.cyclops.react.SimpleReactFailedStageException> error = (t instanceof com.aol.cyclops.react.SimpleReactFailedStageException) ? com.aol.cyclops.control.Xor.primary(((com.aol.cyclops.react.SimpleReactFailedStageException) (t))) : com.aol.cyclops.control.Xor.secondary(t);
    return () -> error;
}