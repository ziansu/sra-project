public java.lang.String getPartitioningKey() {
    if (isOneKeyRequest) {
        return oneKey.toString();
    }else {
        java.lang.String keyConcatenation = "";
        for (fr.inria.jessy.store.ReadRequestKey<?> rk : multiKeys) {
            keyConcatenation = keyConcatenation.concat(rk.toString());
        }
        return keyConcatenation;
    }
}