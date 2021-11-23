@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.util.Log.d("Insurance", "onItemClick");
    GetInsuranceId();
    com.profilohn.Activities.InputActivity.wage.clearFocus();
    com.profilohn.Activities.InputActivity.taxFree.clearFocus();
}