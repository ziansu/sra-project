@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    degutis.martynas.sounding.MainActivity.CONTEXT = getApplicationContext();
    degutis.martynas.sounding.MainActivity.PACKAGE_NAME = getApplicationContext().getPackageName();
    android.widget.GridView gridView = ((android.widget.GridView) (findViewById(R.id.gridView)));
    degutis.martynas.sounding.ButtonAdapter btnAdapter = new degutis.martynas.sounding.ButtonAdapter(this);
    gridView.setAdapter(btnAdapter);
}