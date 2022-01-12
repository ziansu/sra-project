public com.rauban.dropandtransfer.model.protocol.FileTransfer.TransferOffer createTransferOffer(java.io.File[] resources) {
    if ((resources == null) || ((resources.length) == 0))
        return null;
    
    com.rauban.dropandtransfer.model.protocol.FileTransfer.TransferOffer.Builder tob = com.rauban.dropandtransfer.model.protocol.FileTransfer.TransferOffer.newBuilder();
    tob.setOfferId(((nextOutGoingTransferOffferId)++));
    java.lang.String base = resources[0].getParentFile().getAbsolutePath();
    com.rauban.dropandtransfer.util.FileUtil.iterateResources(tob, resources, base);
    com.rauban.dropandtransfer.model.protocol.FileTransfer.TransferOffer to = tob.build();
    return to;
}