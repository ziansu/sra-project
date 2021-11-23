@java.lang.Override
public void done(com.parse.ParseException e) {
    android.util.Log.w("Yuval", "setAvatar() - in done");
    put(Const.COL_NAME_AVATAR, file);
    saveEventually();
}