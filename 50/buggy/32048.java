@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    myTimer.stop();
    dialogInterface.dismiss();
    android.widget.Toast.makeText(this, "Timer stopped.", Toast.LENGTH_SHORT).show();
}