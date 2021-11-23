@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_add_member);
    android.widget.RelativeLayout wrapper = ((android.widget.RelativeLayout) (findViewById(R.id.edit_members_wrapper)));
    wrapper.setVisibility(View.GONE);
    java.util.ArrayList<com.tasking.Employee> members = new java.util.ArrayList<>();
    android.widget.TextView title = ((android.widget.TextView) (findViewById(R.id.title)));
    android.graphics.Typeface boldTypeFace = android.graphics.Typeface.createFromAsset(getAssets(), "fonts/Raleway-Bold.ttf");
    title.setTypeface(boldTypeFace);
}