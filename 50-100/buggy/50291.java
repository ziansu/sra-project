@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        java.lang.System.out.println("Switch is currently ON");
        util.Helper.isBLOCK = true;
        server.userBlock();
        android.widget.Toast.makeText(getApplicationContext(), "Show importance and emergency", Toast.LENGTH_SHORT).show();
    }else {
        java.lang.System.out.println("Switch is currently OFF");
        util.Helper.isBLOCK = false;
        server.userUnBlock();
        android.widget.Toast.makeText(getApplicationContext(), "Block importance and emergency", Toast.LENGTH_SHORT).show();
    }
}