@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    if ((spinner.getSelectedItemPosition()) == 1) {
        txtDetail.setVisibility(View.VISIBLE);
        txtResolve.setVisibility(View.VISIBLE);
    }else {
        txtDetail.setVisibility(View.GONE);
        txtResolve.setVisibility(View.GONE);
    }
    equipment.setDamageLevel(((2 - (spinner.getSelectedItemPosition())) + ""));
}