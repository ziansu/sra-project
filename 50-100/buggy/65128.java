public void func_177135_a(common.zeroquest.entity.zertum.EntityDarkZertum entity, double par1, double par2, double par3, float par4, float par5) {
    if (entity.isWolfWet()) {
        float f2 = (entity.getBrightness(par5)) * (entity.getShadingWhileWet(par5));
        net.minecraft.client.renderer.GlStateManager.color(f2, f2, f2);
    }
    super.doRender(((net.minecraft.entity.EntityLiving) (entity)), par1, par2, par3, par4, par5);
}