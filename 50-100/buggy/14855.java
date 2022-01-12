@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!(hasPermission())) {
            android.support.v4.app.ActivityCompat.requestPermissions(this, PERMISSIONS, 11);
        }else {
            init();
        }
    } catch (java.lang.NullPointerException e) {
        e.printStackTrace();
    } catch (java.lang.ClassCastException e) {
        e.printStackTrace();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}