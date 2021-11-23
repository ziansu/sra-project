@java.lang.Override
public void onFailure(okhttp3.Call call, java.io.IOException e) {
    if ((userListener) != null) {
        userListener.onUserDataLoadError(e.toString());
    }else {
        java.lang.System.out.println("NO USER LISTENER IN API HANDLER");
    }
}