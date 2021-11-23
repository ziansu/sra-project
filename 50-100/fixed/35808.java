private void setListSpinner() {
    mListSpinner = new java.util.ArrayList<>();
    mListSpinner.add(Const.ALL_WORD);
    mListSpinner.add(Const.LEARNED);
    mListSpinner.add(Const.NO_LEARN);
    android.widget.ArrayAdapter<java.lang.String> adapterSpinner = new android.widget.ArrayAdapter(this, android.R.layout.simple_list_item_1, mListSpinner);
    adapterSpinner.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
    mSpinner.setAdapter(adapterSpinner);
}