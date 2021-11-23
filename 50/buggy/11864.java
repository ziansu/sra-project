@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
public void run() {
    try {
        someTask(savedText);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}