public void freePearlFromMercury(vg.civcraft.mc.prisonpearl.PrisonPearl pp, java.lang.String reason, java.lang.String server) {
    storage.removePearl(pp, reason);
    if ((server != null) && ((pp.getImprisonedPlayer()) != null)) {
        respawnPlayerCorrectly(pp.getImprisonedPlayer(), pp, null);
    }
}