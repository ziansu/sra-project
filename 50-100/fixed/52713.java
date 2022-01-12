public java.lang.Object getFieldValue(lk.filetributed.client.rpc.services.services.mergeFileTable_args._Fields field) {
    switch (field) {
        case IP_ADDRESS :
            return getIpAddress();
        case PORT :
            return java.lang.Integer.valueOf(getPort());
        case FILE_TABLE_ENTRIES :
            return getFileTableEntries();
    }
    throw new java.lang.IllegalStateException();
}