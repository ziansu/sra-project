private java.lang.String getCheckedId(java.lang.String requested) throws com.google.blockly.utils.BlockLoadingException {
    if (requested != null) {
        if (!(isBlockIdInUse(requested))) {
            return requested;
        }
    }
    java.lang.String id = java.util.UUID.randomUUID().toString();
    while (mBlockRefs.containsKey(id)) {
        id = java.util.UUID.randomUUID().toString();
    } 
    return id;
}