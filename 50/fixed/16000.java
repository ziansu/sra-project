@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.input_categories);
    connector = new be.coenenjonas.spendapp.Connector();
    setup();
}