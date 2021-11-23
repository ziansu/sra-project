@java.lang.Override
public void onStart() {
    super.onStart();
    setTitle("program is running");
    try {
        con = new no.ntnu.osnap.com.BluetoothConnection("00:10:06:29:00:48", getApplicationContext());
        con.connect();
        printLine(("Trying to connect: " + (con.getAddress())));
    } catch (java.lang.Exception e) {
        printLine(("Could not establish connection: " + (e.getMessage())));
    }
}