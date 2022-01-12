public static void signOut(android.content.Context context) {
    java.util.ArrayList<kr.mamo.travelpoint.db.table.User> list = kr.mamo.travelpoint.db.TP.readUserList(context);
    for (kr.mamo.travelpoint.db.table.User user : list) {
        android.util.Log.i(Constants.LOGCAT_TAGNAME, ("user list : " + (user.getEmail())));
        if (user.isSignIn()) {
            android.util.Log.i(Constants.LOGCAT_TAGNAME, ("signOut : " + (user.getType())));
            user.setSignIn(false);
            kr.mamo.travelpoint.db.TP.updateUser(context, user);
        }
    }
}