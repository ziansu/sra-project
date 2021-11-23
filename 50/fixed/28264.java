@java.lang.Override
public void onActivate() {
    super.onActivate();
    try {
        start();
    } catch (java.lang.Exception e) {
        close();
    }
}