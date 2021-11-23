@java.lang.Override
public void doRender(mca.entity.EntityHuman entity, double x, double y, double z, float entityYaw, float partialTicks) {
    doPreRenderCorrections(entity, partialTicks);
    doRenderEntity(entity, x, y, z, entityYaw, partialTicks);
    doRenderEffects(entity, x, y, z, entityYaw, partialTicks);
}