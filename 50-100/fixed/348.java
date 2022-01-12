private void thinkSpinUp() {
    (diallingTimeout)--;
    if ((diallingTimeout) <= 0) {
        (diallingProgress)++;
        if ((diallingProgress) >= (dest.address.getAddress().length)) {
            thinkPerformConnection();
        }else {
            diallingSymbol = dest.address.getAddress()[diallingProgress];
            diallingTimeout += 40;
            sendUpdates();
            thinkFindTile();
        }
    }
}