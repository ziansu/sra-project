private void setRootId(int newRootId) {
    mRootId = newRootId;
    mNodeList.get(newRootId).setParentId(edu.cmu.chimps.messageontap_api.ParseTree.NOT_EXIST);
}