@java.lang.Override
public void done(com.parse.ParseException e) {
    put(Const.COL_NAME_AVATAR, file);
    saveEventually();
}