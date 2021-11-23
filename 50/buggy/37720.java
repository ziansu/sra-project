@java.lang.Override
public long getOffset(java.lang.Long expectedOffset) {
    return !(failed.isEmpty()) ? failed.entrySet().iterator().next().getKey() : -1;
}