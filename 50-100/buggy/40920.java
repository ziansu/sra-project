@java.lang.Override
public void on(org.mwdb.KNode foundIndex) {
    if (foundIndex == null) {
        throw new java.lang.RuntimeException("Index creation failed, cache is probably full !!!");
    }
    foundIndex.index(Constants.INDEX_ATTRIBUTE, toIndexNode, keyAttributes, new org.mwdb.KCallback<java.lang.Boolean>() {
        @java.lang.Override
        public void on(java.lang.Boolean result) {
            foundIndex.free();
            if (org.mwdb.utility.PrimitiveHelper.isDefined(callback)) {
                callback.on(result);
            }
        }
    });
}