@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        this.db = herbsts.soccer.Database.newInstance();
        this.getAllViews();
        this.registrateEventhandlers();
    } catch (java.lang.Exception e) {
        android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG);
        toast.show();
    }
}