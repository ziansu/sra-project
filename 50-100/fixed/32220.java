@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.kii.cloud.storage.social.connector.KiiSocialNetworkConnector.REQUEST_CODE)) {
        com.kii.cloud.storage.Kii.socialConnect(KiiSocialConnect.SocialNetwork.SOCIALNETWORK_CONNECTOR).respondAuthOnActivityResult(requestCode, resultCode, data);
    }
}