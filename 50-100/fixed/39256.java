public void addNewPendingAndDecode(java.util.HashMap<java.lang.String, java.lang.String> pendingToDecode) {
    for (java.lang.String pending : pendingToDecode.keySet()) {
        this.mPending.put(new java.lang.String(android.util.Base64.decode(pending.getBytes(), Base64.NO_WRAP)), pendingToDecode.get(pending));
    }
}