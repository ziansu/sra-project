@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position == 0) {
        android.widget.Toast.makeText(getActivity(), "This item cannot be deleted or edited", Toast.LENGTH_LONG).show();
        return true;
    }
    MyData.selectAccountIndex = position - 1;
    MyData.selectedAccount = MyData.allMyAccounts.get((position - 1));
    startActivity(new android.content.Intent(getActivity(), com.example.lj.paymentmanagement.EditOrDeleteAccountActivity.class));
    return true;
}