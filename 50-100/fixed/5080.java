public void decryptMessage(java.security.PrivateKey privateKey) throws java.lang.Exception {
    byte[] decryptedBytes = org.votingsystem.signature.util.Encryptor.decryptCMS(aesParams.getBytes(), privateKey);
    decryptMessage(org.votingsystem.signature.util.AESParams.load(org.votingsystem.util.JSON.getMapper().readValue(new java.lang.String(decryptedBytes), org.votingsystem.dto.AESParamsDto.class)));
}