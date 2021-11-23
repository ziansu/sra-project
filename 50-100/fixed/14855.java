@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (hasPermission()) {
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