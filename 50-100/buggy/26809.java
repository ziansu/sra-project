public void storeAwsFile(java.io.File fileToUpload, java.lang.String fileKey) {
    java.lang.String fullFileKey = ((com.iiitd.userstudyframework.CustomPrefManager.shared().getS3FolderName()) + "/") + fileKey;
    android.util.Log.v("dks", ("fullFileKey: " + fullFileKey));
    com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver observer = transferUtility.upload(com.iiitd.userstudyframework.AwsHandler.MY_BUCKET, fullFileKey, fileToUpload);
    transferObserverListener(observer);
}