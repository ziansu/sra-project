public boolean isSet(lk.filetributed.client.rpc.services.services.joinRequest_args._Fields field) {
    if (field == null) {
        throw new java.lang.IllegalArgumentException();
    }
    switch (field) {
        case IP_ADDRESS :
            return isSetIpAddress();
        case PORT :
            return isSetPort();
        case CLUSTER_ID :
            return isSetClusterID();
    }
    throw new java.lang.IllegalStateException();
}