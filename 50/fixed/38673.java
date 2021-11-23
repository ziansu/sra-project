public void forceUpdateFingerTable(FingeredNode s, int fId, int nId) {
    if ((fingerTable[fId].getNode().getId()) == nId) {
        fingerTable[fId].setNode(s);
    }
}