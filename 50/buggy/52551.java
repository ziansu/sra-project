public void removePChar(com.example.sharegame.PlayCharacter pChar) {
    pChar = null;
    if ((cCount.getPCount()) > 0) {
        cCount.playerSubtraction();
    }
}