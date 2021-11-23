public void assign(long linkId, int sendBytes, long sendTimeUS) {
    linkStats[actualCount].assign(linkId, sendBytes, sendTimeUS);
    (actualCount)++;
}