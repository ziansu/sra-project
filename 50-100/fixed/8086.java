@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.SharedPreferences prefs = mContext.getSharedPreferences("apprater", Context.MODE_PRIVATE);
    java.lang.Long date_firstLaunch = java.lang.System.currentTimeMillis();
    if (editor != null) {
        editor.putLong("launch_count", 0);
        editor.putLong("date_firstlaunch", date_firstLaunch);
        editor.commit();
    }
    dialog.dismiss();
}