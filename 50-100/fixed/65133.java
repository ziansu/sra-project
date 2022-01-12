private void loadAccountTypesList() {
    java.lang.String[] accountTypes = getResources().getStringArray(R.array.account_type_entry_values);
    android.widget.ArrayAdapter<java.lang.String> accountTypesAdapter = new android.widget.ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, accountTypes);
    accountTypesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    mAccountTypeSpinner.setAdapter(accountTypesAdapter);
}