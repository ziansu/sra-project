@java.lang.Override
@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public net.minecraft.client.model.ModelBiped getArmorModel(net.minecraft.entity.EntityLivingBase entityLiving, net.minecraft.item.ItemStack stack, int armorSlot) {
    net.minecraft.client.model.ModelBiped model = ClientProxy.armorModels.get(this);
    if (entityLiving != null) {
        model.isSneak = entityLiving.isSneaking();
        model.isRiding = entityLiving.isRiding();
        model.isChild = entityLiving.isChild();
    }
    return model;
}