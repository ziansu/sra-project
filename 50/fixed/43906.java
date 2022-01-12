@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle options = getIntent().getExtras();
    if (options != null) {
        setBuilderOptions(options);
    }
    this.finish();
}