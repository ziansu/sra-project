@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    assert setContentView(R.layout.activity_main);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    toolbar.inflateMenu(R.menu.menu_main);
    toolbar.setTitle("www.mahditajik.ir");
    asdas = $missing$;
    fillData();
}