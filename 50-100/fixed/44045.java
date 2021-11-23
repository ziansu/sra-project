public android.os.Message insert(int ds_id, org.md2k.datakitapi.datatype.DataType dataType) {
    org.md2k.datakit.datarouter.Publishers.getInstance().receivedData(ds_id, dataType);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putSerializable(org.md2k.datakitapi.status.Status.class.getSimpleName(), new org.md2k.datakitapi.status.Status(org.md2k.datakitapi.status.StatusCodes.SUCCESS));
    return prepareMessage(bundle, MessageType.INSERT);
}