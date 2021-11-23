@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    ds = new com.cs506.accountable.sqlite.DataSource(this);
    ds.open();
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_setup_7_);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    toolbar.setTitle("Accountable Setup");
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    ds.close();
}