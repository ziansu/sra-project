public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View v, int pos, long id) {
    java.lang.Object item = parent.getItemAtPosition(pos);
    java.lang.String spin_value = item.toString();
    android.widget.Toast.makeText(parent.getContext(), ("Selected: " + spin_value), Toast.LENGTH_LONG).show();
    mFund.setWeight(pos);
    com.example.dennis.mutualfund.FundLab.get(getActivity()).updateFund(mFund);
}