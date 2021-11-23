public void handleSetUp() {
    android.content.Intent intent = new android.content.Intent(this, mobilegroup1.npcgenerator.HubActivity.class);
    mobilegroup1.npcgenerator.Singleton.getInstance();
    startActivity(intent);
}