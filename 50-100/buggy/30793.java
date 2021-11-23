protected T getType(int x, int z, java.util.Map<T, java.lang.Float> objs) {
    float random = typeNoiseGen.noise(x, z);
    for (T generator : objs.keySet()) {
        java.lang.Float threshold = objs.get(generator);
        if (threshold != null) {
            if (random < threshold) {
                return generator;
            }else {
                random -= threshold;
            }
        }
    }
    return null;
}