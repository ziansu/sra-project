public static com.google.android.material.motion.Operation<java.lang.Float[], java.lang.Float[]> normalizedBy(final float normal) {
    return new com.google.android.material.motion.MapOperation<java.lang.Float[], java.lang.Float[]>() {
        @java.lang.Override
        public java.lang.Float[] transform(java.lang.Float[] value) {
            return new java.lang.Float[]{ (value[0]) / normal , (value[1]) / normal };
        }
    };
}