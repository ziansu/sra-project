@java.lang.Override
public org.terasology.rendering.nui.layers.mainMenu.videoSettings.EnvironmentalEffects get() {
    if ((config.isAnimateGrass()) && (!(config.isAnimateWater()))) {
        return EnvironmentalEffects.LOW;
    }else
        if ((config.isAnimateGrass()) && (config.isAnimateWater())) {
            return EnvironmentalEffects.HIGH;
        }else {
            return EnvironmentalEffects.OFF;
        }
    
}