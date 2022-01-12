@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.TextView tv = ((android.widget.TextView) (view));
    tv.setTextColor(getResources().getColor(R.color.colorW));
    tv.setTextSize(20.0F);
    tv.setGravity(android.view.Gravity.CENTER_HORIZONTAL);
}