public void setCustomBiomes(java.util.List<org.pepsoft.worldpainter.biomeschemes.CustomBiome> customBiomes) {
    this.customBiomes = customBiomes;
    if (customBiomes != null ? !(customBiomes.equals(this.customBiomes)) : (this.customBiomes) != null) {
        java.util.List<org.pepsoft.worldpainter.biomeschemes.CustomBiome> oldCustomBiomes = this.customBiomes;
        this.customBiomes = customBiomes;
        dirty = true;
        propertyChangeSupport.firePropertyChange("customBiomes", oldCustomBiomes, customBiomes);
    }
}