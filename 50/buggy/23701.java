@java.lang.Override
public void performAction(net.minecraft.entity.EntityLivingBase entityLivingBase, net.minecraftforge.fml.common.eventhandler.Event baseEvent) {
    int enchantmentLevel = this.getEnchantmentLevel(entityLivingBase.getEquipmentInSlot(1));
    entityLivingBase.motionY += (((float) (1)) / 15) * enchantmentLevel;
}