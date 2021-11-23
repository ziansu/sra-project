@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if ((parent == null) || (view == null)) {
        return ;
    }
    android.widget.TextView tv = ((android.widget.TextView) (view));
    tv.setTextColor(getResources().getColor(R.color.colorW));
    tv.setTextSize(20.0F);
    tv.setGravity(android.view.Gravity.CENTER_HORIZONTAL);
}