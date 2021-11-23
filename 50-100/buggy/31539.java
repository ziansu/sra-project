private double powerFunction(int level) {
    int max = java.lang.Math.max(mp.getConfig().getInt("max-major-level"), mp.getConfig().getInt("max-minor-level"));
    return 0.98 * (java.lang.Math.sin((((level * (java.lang.Math.PI)) / max) / 2)));
}