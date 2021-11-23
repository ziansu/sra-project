public void handleSetUp() throws java.lang.InterruptedException {
    android.content.Intent intent = new android.content.Intent(this, mobilegroup1.npcgenerator.HubActivity.class);
    mobilegroup1.npcgenerator.Singleton.getInstance();
    wait(5000);
    startActivity(intent);
}