private void addView(ro.pub.cs.taskplanner.Plan plan) {
    android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
    android.widget.Button button = new android.widget.Button(this);
    button.setText(plan.getName());
    button.setId(((idCounter)++));
    plansLayout.addView(button, params);
    button.setOnClickListener(new ro.pub.cs.taskplanner.MainActivity.ButtonEditActivity());
    writePlansToFile();
}