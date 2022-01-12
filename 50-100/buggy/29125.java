public void addOneItemOnCategorySpinner(java.lang.String newCategory) {
    category_spinner = ((android.widget.Spinner) (getView().findViewById(R.id.category_spinner)));
    category_list.add(newCategory);
    android.widget.ArrayAdapter<java.lang.String> dataAdapter = new android.widget.ArrayAdapter<java.lang.String>(this.getActivity(), android.R.layout.simple_spinner_item, category_list);
    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    category_spinner.setAdapter(new dragon.tamu.playphrase.NothingSelectedSpinnerAdapter(dataAdapter, R.layout.contact_phrase_spinner_row_nothing_selected, this.getActivity()));
    category_spinner.setSelection(category_list.size());
}