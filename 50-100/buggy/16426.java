@java.lang.Override
public void onUpdate(net.minecraft.world.World world) {
    if ((sharedData.hasKey("CookTime")) == false) {
        sharedData.setInteger("CookTime", 0);
    }
    dmfmm.StarvationAhoy.Core.util.SALog.error(((((("Multiblock - AT POS: " + (this.x)) + " Y: ") + (this.y)) + " Z:") + (this.z)));
}