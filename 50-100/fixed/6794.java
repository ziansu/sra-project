@java.lang.Override
public void done(java.util.List<com.example.user.simpleui.Order> objects, com.parse.ParseException e) {
    if (e == null) {
        com.example.user.simpleui.Order.pinAllInBackground("Order", objects);
        callback.done(objects, e);
    }else {
        com.example.user.simpleui.Order.getQuery().fromLocalDatastore().findInBackground(callback);
    }
}