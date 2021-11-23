@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    android.widget.ArrayAdapter adapterAutoComplete = new android.widget.ArrayAdapter(context, android.R.layout.simple_list_item_1, autoCompleteNames);
    fragment.autoCompleteStringFillerAsyncTaskOnPostExecute(adapterAutoComplete, cities);
}