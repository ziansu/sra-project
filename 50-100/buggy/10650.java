@java.lang.Override
public void doWrite(java.io.DataOutput out) throws java.io.IOException {
    out.writeInt(this.seedList.size());
    for (ml.shifu.shifu.core.dvarsel.CandidateSeed seed : this.seedList) {
        out.write(seed.getId());
        java.util.List<java.lang.Integer> columnIdList = seed.getColumnIdList();
        out.write(columnIdList.size());
        for (java.lang.Integer columnId : columnIdList) {
            out.write(columnId);
        }
    }
}