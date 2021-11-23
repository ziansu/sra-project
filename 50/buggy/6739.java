@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (com.quickblox.sample.chat.utils.SharedPreferencesUtil.hasQbUser()) {
        proceedToTheNextActivityWithDelay();
        return ;
    }
    proceedToTheNextActivity();
}