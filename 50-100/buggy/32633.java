public static void findViews(android.view.View view) {
    com.dsl14.lunchdecider.MainActivity.tSpinner = ((android.widget.Spinner) (view.findViewById(R.id.weatherSpinner)));
    com.dsl14.lunchdecider.MainActivity.tSpinner.setOnItemSelectedListener(com.dsl14.lunchdecider.MainActivity.wlistener);
    com.dsl14.lunchdecider.MainActivity.tSpinner = ((android.widget.Spinner) (view.findViewById(R.id.budgetSpinner)));
    com.dsl14.lunchdecider.MainActivity.tSpinner.setOnItemSelectedListener(com.dsl14.lunchdecider.MainActivity.blistener);
    android.widget.RadioButton n = ((android.widget.RadioButton) (view.findViewById(R.id.noButton)));
    n.setChecked(true);
}