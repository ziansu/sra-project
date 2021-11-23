@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    myTimer.start();
    dialogInterface.dismiss();
    android.widget.Toast.makeText(this, "Timer started.", Toast.LENGTH_SHORT).show();
}