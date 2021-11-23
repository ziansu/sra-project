public void uploadItem(com.project4398.michael.austinfoodtrucks.TruckInfo itemToUpload) {
    java.io.File file = new java.io.File(mContext.getFilesDir(), "fileName.txt");
    java.io.FileOutputStream fos = null;
    org.json.JSONObject TruckItemJson = toJsonAndBeyond(itemToUpload);
    try {
        file = com.project4398.michael.austinfoodtrucks.AWSInterface.createSampleFile(TruckItemJson);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    android.util.Log.d("uploadItem", "Creating an AmazonS3Client");
    com.amazonaws.services.s3.AmazonS3Client s3Client = getAmazonS3Client();
    com.amazonaws.services.s3.model.PutObjectRequest por = new com.amazonaws.services.s3.model.PutObjectRequest(Bucket_Curr, itemToUpload.name, file);
    s3Client.putObject(por);
}