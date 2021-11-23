protected void getAndSetToken(final java.lang.String iamPrincipalArn, final com.amazonaws.regions.Region region) {
    final com.amazonaws.services.kms.AWSKMSClient kmsClient = new com.amazonaws.services.kms.AWSKMSClient();
    kmsClient.setRegion(region);
    final java.lang.String encryptedAuthData = getEncryptedAuthData(iamPrincipalArn, region);
    final com.nike.vault.client.model.VaultAuthResponse decryptedToken = decryptToken(kmsClient, encryptedAuthData);
    final org.joda.time.DateTime expires = org.joda.time.DateTime.now(DateTimeZone.UTC);
    expires.plusSeconds(((decryptedToken.getLeaseDuration()) - (paddingTimeInSeconds)));
    credentials = new com.nike.vault.client.auth.TokenVaultCredentials(decryptedToken.getClientToken());
    expireDateTime = expires;
}