@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle options = getIntent().getExtras();
    setBuilderOptions(options);
    this.finish();
}