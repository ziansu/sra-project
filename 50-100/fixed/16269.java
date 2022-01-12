public static void shiftRight(net.minecraft.entity.player.EntityPlayer player) {
    com.lothrazar.samsmagic.ISpell current = com.lothrazar.samsmagic.SpellRegistry.getPlayerCurrentISpell(player);
    if ((current.right()) != null) {
        com.lothrazar.samsmagic.SpellRegistry.setPlayerCurrentSpell(player, current.right().getSpellID());
        com.lothrazar.samsmagic.ModSpells.playSoundAt(player, "random.orb");
    }
}