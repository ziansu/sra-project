public void addLineItem() {
    if (((curBudget) - (db.getTotalAllocated())) == 0) {
        android.widget.Toast.makeText(getActivity(), "please set budget ", Toast.LENGTH_SHORT).show();
        android.support.v4.app.DialogFragment fragment = new com.byteshaft.mybudget.ui.BudgetDialogFragment();
        fragment.show(getFragmentManager(), "budget");
        fragment.setCancelable(false);
    }else {
        android.content.Intent intent = new android.content.Intent(getActivity(), com.byteshaft.mybudget.activities.items.AddItemActivity.class);
        startActivity(intent);
    }
}