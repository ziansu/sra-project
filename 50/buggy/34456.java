private static void setPlayerCurrentSpell(net.minecraft.entity.player.EntityPlayer player, int current_id) {
    com.lothrazar.samsmagic.PlayerPowerups props = com.lothrazar.samsmagic.PlayerPowerups.get(player);
    java.lang.System.out.println(("setPlayerCurrentSpell " + current_id));
    java.lang.System.out.println(((player.worldObj.isRemote) + " .."));
    props.setSpellCurrent(current_id);
}