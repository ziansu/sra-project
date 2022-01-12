public boolean executeCallNearFF() {
    long offset = mrs.getValMemory(pc);
    callNear_(offset, true);
    return true;
}