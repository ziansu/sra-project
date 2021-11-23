@java.lang.Override
public void onItemSelected(java.lang.String gid) {
    if (type.equals(SelectProductFragment.RequestType.REQ_GROUPS)) {
        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.myLay, new com.example.dawid.dietalpha.controller.SelectProductFragment(SelectProductFragment.RequestType.REQ_PRODUCTS, gid));
        transaction.addToBackStack(null);
        transaction.commit();
        type = SelectProductFragment.RequestType.REQ_PRODUCTS;
    }else {
        android.support.v4.app.DialogFragment dialog = new com.example.dawid.dietalpha.controller.ItemAmountDialog();
        dialog.show(getSupportFragmentManager(), "AMOUNT");
        this.gid = gid;
    }
}