private java.lang.String getRankName(java.util.UUID uuid) {
    if (uuid == null) {
        return null;
    }
    vg.civcraft.mc.namelayer.GroupManager.PlayerType pType = g.getPlayerType(uuid);
    if (pType == null) {
        return null;
    }
    return vg.civcraft.mc.namelayer.gui.MemberViewGUI.getDirectRankName(pType);
}