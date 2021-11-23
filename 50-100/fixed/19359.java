public static java.lang.String addPhoto(java.lang.String accountId, java.lang.String receiptId, byte[] pic) throws java.io.IOException {
    java.lang.System.out.println("Adding photo!!!");
    java.lang.String blobName = (("user/" + accountId) + "/") + receiptId;
    com.google.cloud.storage.Blob blob = rrr.third_party.firebase.firebaseUtil.bucket.create(blobName, pic, "image/jpg");
    return blobName;
}