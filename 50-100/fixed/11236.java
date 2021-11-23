@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.view.LayoutInflater inflater = ((android.view.LayoutInflater) (getSystemService(de.prismatikremote.hartz.prismatikremote.activities.LAYOUT_INFLATER_SERVICE)));
    mDrawerLayout.addView(inflater.inflate(R.layout.activity_settings, null));
    android.widget.Button applySettings = ((android.widget.Button) (findViewById(R.id.apply_settings)));
    applySettings.setOnClickListener(this);
    updateUi();
}