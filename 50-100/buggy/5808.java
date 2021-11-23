public static com.google.android.material.motion.Operation<java.lang.Float[], java.lang.Float[]> normalizedBy(final float normal) {
    return new com.google.android.material.motion.MapOperation<java.lang.Float[], java.lang.Float[]>() {
        @java.lang.Override
        public java.lang.Float[] transform(java.lang.Float[] value) {
            float x = value[0];
            float y = value[1];
            return new java.lang.Float[]{ x / normal , y / normal };
        }
    };
}