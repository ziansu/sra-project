public void assign(long linkId, int sendBytes, long sendTimeUS) {
    if ((actualCount) < (linkStats.length)) {
        linkStats[actualCount].assign(linkId, sendBytes, sendTimeUS);
        (actualCount)++;
    }
}