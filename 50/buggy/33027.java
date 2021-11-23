@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.widget.Toast.makeText(context, R.string.update_start_hint, Toast.LENGTH_SHORT).show();
    new com.oidiotlin.classmanager.utils.network.UpdateAppTask(context, handler).run();
}