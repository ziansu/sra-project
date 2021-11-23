public static void signOut(android.content.Context context) {
    java.util.ArrayList<kr.mamo.travelpoint.db.table.User> list = kr.mamo.travelpoint.db.TP.readUserList(context);
    for (kr.mamo.travelpoint.db.table.User user : list) {
        if (user.isSignIn()) {
            user.setSignIn(false);
            kr.mamo.travelpoint.db.TP.updateUser(context, user);
        }
    }
}