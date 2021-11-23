@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d("MyFormula", "onResume called");
    adapter.notifyDataSetChanged();
    android.util.Log.d("MyFormula", ("List count: " + (java.lang.Integer.toString(formulaList.size()))));
}