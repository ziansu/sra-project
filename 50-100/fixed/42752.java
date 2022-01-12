static <T> com.google.android.material.motion.MapOperation<T, java.lang.Boolean> not(final com.google.android.material.motion.MapOperation<T, java.lang.Boolean> operation) {
    return new com.google.android.material.motion.MapOperation<T, java.lang.Boolean>() {
        @java.lang.Override
        public java.lang.Boolean transform(T value) {
            return !(operation.transform(value));
        }
    };
}