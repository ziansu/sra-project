public static me.twango.twango.entity.User getInstance(android.content.Context context) {
    if ((me.twango.twango.entity.User.me) != null) {
        return me.twango.twango.entity.User.me;
    }
    me.twango.twango.helper.DBHelper dbHelper = new me.twango.twango.helper.DBHelper(context);
    me.twango.twango.entity.User.me = dbHelper.getUser();
    return me.twango.twango.entity.User.me;
}