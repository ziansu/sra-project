private void initRequestAndVkManager() {
    com.azazai.EventsApp eventsApp = com.azazai.EventsApp.getInstance();
    eventsApp.initIp();
    requestManager = eventsApp.createRequestManager();
    vkInitManager = new com.azazai.vk.VkInitManager(this, requestManager) {
        @java.lang.Override
        protected void onVkUserReached(com.vkandroid.VkUser vkUser) {
            super.onVkUserReached(vkUser);
            startMainActivity();
        }
    };
}