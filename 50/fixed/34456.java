private static void setPlayerCurrentSpell(net.minecraft.entity.player.EntityPlayer player, int current_id) {
    com.lothrazar.samsmagic.PlayerPowerups props = com.lothrazar.samsmagic.PlayerPowerups.get(player);
    props.setSpellCurrent(current_id);
}