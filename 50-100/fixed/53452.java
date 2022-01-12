@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_group_create);
    newGroupUsers = new java.util.ArrayList<com.parse.ParseUser>();
    addUserDialog = null;
    groupCreateTextView = ((android.widget.TextView) (findViewById(R.id.groupCreateButton)));
    android.graphics.Typeface myFont = android.graphics.Typeface.createFromAsset(getAssets(), "fonts/FFF_Tusj.ttf");
    groupCreateTextView.setTypeface(myFont);
}