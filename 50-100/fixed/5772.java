protected void onStop(android.os.Bundle savedInstanceState) throws java.io.IOException {
    try {
        dos.writeBytes(("\n" + ("mount -o remount,ro /system" + "\n")));
        dos.writeBytes(("\n" + ("exit" + "\n")));
        dos.flush();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}