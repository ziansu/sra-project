@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mContext = this;
    counterTextView = ((android.widget.TextView) (findViewById(R.id.textView)));
    relativeLayout = ((android.widget.RelativeLayout) (findViewById(R.id.MainLayoutID)));
    localPreferences = getSharedPreferences(com.example.rogith.deltaappdevtask1.MainActivity.MyPREFERENCES, Context.MODE_PRIVATE);
    localPreferences.registerOnSharedPreferenceChangeListener(this);
    counter = getFromFile();
    counterTextView.setText(java.lang.String.valueOf(counter));
}