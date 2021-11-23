@java.lang.Override
public void onClick(android.view.View view) {
    if (((mArrayList.size()) == 0) || (!(mArrayList.contains(new com.example.shashank.splitbill.Model.NameModel(autoCompleteTextView.getText().toString()))))) {
        autoCompleteTextView.setError("Please select group name");
    }else {
        booleanHashMap.clear();
        showDialog(autoCompleteTextView.getText().toString());
    }
}