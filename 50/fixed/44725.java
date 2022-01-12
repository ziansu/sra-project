@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    strBankName = spinnerBankName.getSelectedItem().toString();
    fetchBancaBranchdata(strBankName);
}