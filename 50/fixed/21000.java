@java.lang.Override
public byte[] parseObjectToBytes(java.lang.Object objData) throws java.lang.Exception {
    if (objData instanceof byte[]) {
        return ((byte[]) (objData));
    }else {
        return com.minhld.job2p.supports.Utils.serialize(objData);
    }
}