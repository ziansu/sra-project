@java.lang.Override
public void onClick(android.view.View v) {
    try {
        android.widget.EditText editText = ((android.widget.EditText) (findViewById(R.id.level_edit_text)));
        com.growthbeat.analytics.GrowthAnalytics.getInstance().setLevel(java.lang.Integer.valueOf(editText.getText().toString()));
    } catch (java.lang.NumberFormatException e) {
        android.util.Log.w("Grwothbeat Sample", ("Input value error :" + (e.getMessage())));
    }
}