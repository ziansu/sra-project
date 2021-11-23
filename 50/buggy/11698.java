public void executeCallNearFF() {
    int width = getOpWidth();
    long offset = com.zms.zpc.execute.NumberUtils.asSigned(mrs.getValMemory(pc), width);
    callNear_(offset);
}