public java.lang.String eventMessage(boolean doOrUndo) {
    java.lang.String messageToReturn;
    if (doOrUndo) {
        messageToReturn = (((((("An earthquake has damaged Player " + ((this.playerAffected) + 1)) + "'s tiles! ") + "Production is now divided by ") + (tileDamageValue)) + " on their tiles for ") + (this.duration)) + " turns.";
    }else {
        messageToReturn = (("The damage to Player " + ((this.playerAffected) + 1)) + " from the earthquake 2 turns ago ") + "has been repaired! The effects of this have been reversed.";
    }
    return messageToReturn;
}