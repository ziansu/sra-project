private void thinkSpinUp() {
    (diallingTimeout)--;
    if ((diallingTimeout) <= 0) {
        (diallingProgress)++;
        diallingSymbol = dest.address.getAddress()[diallingProgress];
        if ((diallingProgress) >= (dest.address.getAddress().length)) {
            thinkPerformConnection();
        }else {
            diallingTimeout += 40;
            sendUpdates();
            thinkFindTile();
        }
    }
}