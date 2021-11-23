@com.facebook.react.bridge.ReactMethod
public void initializeRNS3() {
    if (com.mybigday.rns3.RNS3TransferUtility.alreadyInitialize)
        return ;
    
    com.mybigday.rns3.RNS3TransferUtility.alreadyInitialize = true;
    subscribeList(transferUtility.getTransfersWithType(TransferType.UPLOAD));
    subscribeList(transferUtility.getTransfersWithType(TransferType.DOWNLOAD));
}