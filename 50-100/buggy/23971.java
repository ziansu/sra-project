@java.lang.Override
public micdoodle8.mods.galacticraft.api.vector.Vector3 getFogColor() {
    float f = 1.0F - (this.getStarBrightness(1.0F));
    return new micdoodle8.mods.galacticraft.api.vector.Vector3(((102 / 255.0F) * f), ((178 / 255.0F) * f), ((255 / 205.0F) * f));
}