@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    boolean edited = helper.editFavouriteName(point, point.getName(), cat.getText().toString(), editDescr.getText().toString());
    if (edited && (callback != null)) {
        callback.run();
    }
}