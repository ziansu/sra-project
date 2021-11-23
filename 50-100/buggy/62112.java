public boolean isPlayerInFaction(net.minecraft.entity.player.EntityPlayer player, superdopesquad.superdopejedimod.faction.FactionInfo factionInfoInput) {
    superdopesquad.superdopejedimod.faction.ClassInfo classInfo = this.getPlayerClass(player);
    superdopesquad.superdopejedimod.faction.FactionInfo factionInfo = (classInfo == null) ? null : classInfo.getFaction();
    return (factionInfo != null) && ((factionInfoInput.getId()) == (factionInfo.getId()));
}