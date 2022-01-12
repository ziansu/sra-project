@java.lang.Override
public void run() {
    if ((editMode) == 1) {
        android.widget.Toast.makeText(getApplicationContext(), "New record added!", Toast.LENGTH_LONG).show();
        this.finish();
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Record upadted!", Toast.LENGTH_LONG).show();
    }
}