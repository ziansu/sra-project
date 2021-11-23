public void checkBlacklist(appaloosa_store.com.appaloosa_android_tools.tools.interfaces.ApplicationAuthorizationActivity listeningActivity) {
    this.activity = listeningActivity;
    appaloosa_store.com.appaloosa_android_tools.tools.services.blacklist.CheckBlacklistService.checkBlacklist(listeningActivity);
}