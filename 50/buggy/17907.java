@java.lang.Override
public java.lang.Long value() {
    if (mem != null) {
        return mem.actualUsed().bytes();
    }
    return -1L;
}