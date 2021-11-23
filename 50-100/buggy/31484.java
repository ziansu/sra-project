public static int getExperienceCostForNextLevel(net.minecraft.entity.player.EntityPlayer player) {
    final palaster.bb.api.capabilities.entities.IRPG rpg = palaster.bb.api.capabilities.entities.RPGCapability.RPGCapabilityProvider.get(player);
    if (rpg != null) {
        int rpgLevel = (((rpg.getConstitution()) + (rpg.getStrength())) + (rpg.getDefense())) + (rpg.getDexterity());
        return ((int) (rpgLevel * 1.25));
    }
    return 0;
}