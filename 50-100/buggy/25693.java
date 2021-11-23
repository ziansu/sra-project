@java.lang.Override
public void onClick(android.view.View view) {
    if (com.vk.sdk.VKSdk.isLoggedIn()) {
        android.util.Log.e("Uje logged in", "Uje Loged in");
    }
    com.vk.sdk.VKSdk.authorize(com.spb.sezam.VKActivity.myScope);
    if (com.vk.sdk.VKSdk.isLoggedIn()) {
        android.util.Log.e("Uje logged in2", "Uje Loged in2");
    }
}