@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    boolean edited = helper.editFavouriteName(point, editText.getText().toString().trim(), cat.getText().toString(), editDescr.getText().toString());
    if (edited && (callback != null)) {
        callback.run();
    }
}