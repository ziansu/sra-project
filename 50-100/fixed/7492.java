@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mContext = this;
    counterTextView = ((android.widget.TextView) (findViewById(R.id.textView)));
    relativeLayout = ((android.widget.RelativeLayout) (findViewById(R.id.MainLayoutID)));
}