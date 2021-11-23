@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.common_names_description);
    android.os.Bundle extras = getIntent().getExtras();
    common_name_rowid = extras.getLong(CommonNamesAdapter.COMMON_NAME_ROWID);
    common_name = extras.getString(CommonNamesAdapter.COMMON_NAME);
    common_name_count = extras.getString(CommonNamesAdapter.COMMON_NAME_COUNT).toString();
    description = (common_name) + (text);
    balu.android.CommonNameDescription.tv = ((android.widget.TextView) (findViewById(R.id.common_name_description_text)));
    balu.android.CommonNameDescription.tv.setText(description);
}