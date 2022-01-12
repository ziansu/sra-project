public static void shiftRight(net.minecraft.entity.player.EntityPlayer player) {
    java.lang.System.out.println("shiftRight");
    com.lothrazar.samsmagic.ISpell current = com.lothrazar.samsmagic.SpellRegistry.getPlayerCurrentISpell(player);
    if ((current.right()) != null) {
        java.lang.System.out.println(("id" + (current.right().getSpellID())));
        com.lothrazar.samsmagic.SpellRegistry.setPlayerCurrentSpell(player, current.right().getSpellID());
        com.lothrazar.samsmagic.ModSpells.playSoundAt(player, "random.orb");
    }
}