@java.lang.SuppressWarnings(value = "unused")
public void getSelf(com.emreeran.android.instagram.Instagram.UserCallback callback) {
    com.emreeran.android.instagram.controllers.UserController controller = new com.emreeran.android.instagram.controllers.UserController(mContext);
    java.lang.String token = getAccessToken();
    if (token != null) {
        controller.getSelf(token, callback);
    }else {
    }
}