@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int pos, long l) {
    switch (parent.getId()) {
        case R.id.college_spinner :
            college_selected = parent.getItemAtPosition(pos).toString();
            break;
        case R.id.year_spinner :
            year_selected = parent.getItemAtPosition(pos).toString();
            break;
    }
    android.util.Log.d("Spinner", ((college_selected) + (year_selected)));
}