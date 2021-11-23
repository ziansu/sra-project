public void updateObjIdOnStack(int objId, int traceBack) {
    int idx = ((this.stackSimulator.size()) - 1) - traceBack;
    edu.columbia.psl.cc.pojo.InstNode latestInst = this.stackSimulator.get(idx);
    latestInst.setRelatedObjId(objId);
}