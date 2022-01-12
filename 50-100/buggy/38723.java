public static java.util.List<teamOD.armourReborn.common.modifiers.ITrait> getArmourTraits(net.minecraft.entity.player.EntityPlayer player, net.minecraft.item.ItemStack armour) {
    java.util.List<teamOD.armourReborn.common.modifiers.ITrait> result = com.google.common.collect.Lists.newLinkedList();
    if ((armour.getItem()) instanceof teamOD.armourReborn.common.item.equipment.ItemModArmour) {
        teamOD.armourReborn.common.item.equipment.ItemModArmour modArmour = ((teamOD.armourReborn.common.item.equipment.ItemModArmour) (armour.getItem()));
        result.addAll(teamOD.armourReborn.common.lib.LibUtil.getTraitsModifiersList(armour));
        if (modArmour.hasArmourSet(player)) {
            result.addAll(teamOD.armourReborn.common.lib.LibUtil.getTraitsListArmourSet(armour));
        }
    }
    return result;
}