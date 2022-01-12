@java.lang.Override
public void onError(com.androidnetworking.error.ANError anError) {
    try {
        android.util.Log.d(in.reweyou.reweyou.UserChat.TAG, ("onError: " + (anError.getResponse())));
        userChatAdapter.changestateofsendingmessage(false);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}