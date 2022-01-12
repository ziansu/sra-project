public io.github.griffenx.CityZen.ProtectionLevel getProtectionLevel() {
    if (!(isMega())) {
        return ProtectionLevel.PROTECTED;
    }
    try {
        int levelIndex = java.lang.Integer.valueOf(getProperty("protection"));
        if ((levelIndex > 2) || (levelIndex < 0))
            levelIndex = 2;
        
        return io.github.griffenx.CityZen.ProtectionLevel.values()[levelIndex];
    } catch (java.lang.NumberFormatException e) {
        return ProtectionLevel.PROTECTED;
    }
}