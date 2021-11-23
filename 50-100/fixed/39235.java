public java.lang.String eventMessage(boolean doOrUndo) {
    java.lang.String messageToReturn;
    if (doOrUndo) {
        messageToReturn = ((((("Player " + ((this.playerAffected) + 1)) + "'s roboticon on tile ") + (this.roboticonTileNo)) + " has malfunctioned and is now out of use for ") + (this.duration)) + " turns.";
    }else {
        messageToReturn = ((("Player " + ((this.playerAffected) + 1)) + "'s roboticon on tile ") + (this.roboticonTileNo)) + " has now been fixed and can produce resources as normal.";
    }
    return messageToReturn;
}