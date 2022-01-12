public static void shiftLeft(net.minecraft.entity.player.EntityPlayer player) {
    java.lang.System.out.println("shiftLeft");
    com.lothrazar.samsmagic.ISpell current = com.lothrazar.samsmagic.SpellRegistry.getPlayerCurrentISpell(player);
    if ((current.left()) != null) {
        com.lothrazar.samsmagic.SpellRegistry.setPlayerCurrentSpell(player, current.left().getSpellID());
        com.lothrazar.samsmagic.ModSpells.playSoundAt(player, "random.orb");
    }
}