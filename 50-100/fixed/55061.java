public java.lang.Boolean removePlayer(com.teamtreehouse.model.Player playerToBeDeleted) {
    if ((this.mPlayers.size()) == 0) {
        throw new com.teamtreehouse.utils.SLOException(com.teamtreehouse.utils.SLCode.SL0007, Severity.Warning, playerListSizeEmpty, this);
    }
    java.lang.Boolean isDeleted = this.mPlayers.remove(playerToBeDeleted);
    if (!isDeleted) {
        throw new com.teamtreehouse.utils.SLOException(com.teamtreehouse.utils.SLCode.SL0008, playerRemoveFromTeam, playerToBeDeleted.getName(), this);
    }
    return isDeleted;
}