public static java.nio.ByteBuffer toByteStream(com.amazonaws.services.kms.AWSKMSClient kms, kinesisencryption.dao.BootCarObject car, java.lang.String keyId) throws java.io.UnsupportedEncodingException {
    com.amazonaws.services.kms.model.EncryptRequest request = new com.amazonaws.services.kms.model.EncryptRequest().withKeyId(keyId).withPlaintext(java.nio.ByteBuffer.wrap(java.lang.String.format(car.toString()).getBytes("UTF-8")));
    com.amazonaws.services.kms.model.EncryptResult result = kms.encrypt(request);
    return result.getCiphertextBlob();
}