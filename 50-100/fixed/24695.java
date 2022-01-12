@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    setTheme(R.style.AppTheme);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_help);
    setToolbar(R.id.toolbar, true);
    android.widget.TextView title = ((android.widget.TextView) (findViewById(R.id.toolbar_text)));
    title.setText(R.string.ids_title_help);
    android.widget.TextView tvAbout = ((android.widget.TextView) (findViewById(R.id.textview_about)));
    tvAbout.setText(getString(R.string.ids_lbl_about));
}