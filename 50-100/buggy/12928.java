@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getLayoutRes()) > 0) {
        setContentView(R.layout.activity_base);
        butterknife.ButterKnife.bind(this);
        android.view.View content = android.view.LayoutInflater.from(this).inflate(getLayoutRes(), root, false);
        if (hasTitle()) {
            android.support.v7.widget.Toolbar toolbar = inflateToolbar();
            root.addView(toolbar);
        }
        root.addView(content);
    }
}