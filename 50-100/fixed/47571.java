@java.lang.Override
public net.silentchaos512.gems.config.ConfigOption validate() {
    veinCount = net.minecraft.util.math.MathHelper.clamp(veinCount, net.silentchaos512.gems.config.ConfigOptionOreGen.VEIN_COUNT_MIN, net.silentchaos512.gems.config.ConfigOptionOreGen.VEIN_COUNT_MAX);
    veinSize = net.minecraft.util.math.MathHelper.clamp(veinSize, net.silentchaos512.gems.config.ConfigOptionOreGen.VEIN_SIZE_MIN, net.silentchaos512.gems.config.ConfigOptionOreGen.VEIN_SIZE_MAX);
    minY = net.minecraft.util.math.MathHelper.clamp(minY, net.silentchaos512.gems.config.ConfigOptionOreGen.Y_MIN, net.silentchaos512.gems.config.ConfigOptionOreGen.Y_MAX);
    maxY = net.minecraft.util.math.MathHelper.clamp(maxY, net.silentchaos512.gems.config.ConfigOptionOreGen.Y_MIN, net.silentchaos512.gems.config.ConfigOptionOreGen.Y_MAX);
    if ((maxY) <= (minY)) {
        maxY = (minY) + 1;
    }
    return this;
}