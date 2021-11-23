public com.nosix.cloud.rpc.Reference<T> select() {
    if (((references) == null) || ((references.size()) <= 0)) {
        return null;
    }
    java.util.List<com.nosix.cloud.rpc.Reference<T>> list = getAvailableReferences();
    if ((list.size()) <= 0) {
        return null;
    }
    if ((list.size()) == 1) {
        return list.get(0);
    }
    return doSelect(list);
}