@java.lang.Override
public void setInventorySlotContents(net.minecraft.inventory.IInventory inventory, int slotId, net.minecraft.item.ItemStack stack) {
    if (entity.worldObj.isRemote) {
        return ;
    }
    if (stack == null) {
        riskyken.armourersWorkshop.api.common.skin.type.ISkinType skinType = getSkinTypeForSlot(slotId);
        equipmentData.removeEquipment(skinType, 0);
    }else {
        riskyken.armourersWorkshop.common.skin.data.SkinPointer skinData = riskyken.armourersWorkshop.utils.SkinNBTHelper.getSkinPointerFromStack(stack);
        equipmentData.addEquipment(skinData.skinType, 0, skinData);
    }
    sendEquipmentDataToPlayerToAllPlayersAround();
}