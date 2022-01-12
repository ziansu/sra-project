private double powerFunction(int level) {
    int max = java.lang.Math.max(mp.getConfig().getInt("max-major-level"), mp.getConfig().getInt("max-minor-level"));
    return java.lang.Math.sin((((level * (java.lang.Math.PI)) / max) / 2));
}