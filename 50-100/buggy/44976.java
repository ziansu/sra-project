@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    Httpclientoptions = position;
    if (position == 2) {
        jsonparserselector.setVisibility(View.INVISIBLE);
        jsonparingOption = 0;
    }else {
        jsonparserselector.setVisibility(View.VISIBLE);
        jsonparserselector.setSelection(0);
        jsonparingOption = 0;
    }
}