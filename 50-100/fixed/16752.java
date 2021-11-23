private java.lang.String getDataString(android.widget.EditText[] dataTable) {
    java.lang.String result = "";
    for (int i = 0; i < 18; i++) {
        if (dataTable[i].getText().toString().equals("")) {
            result = result + "0,";
        }else {
            result = (result + (dataTable[i].getText().toString())) + ",";
        }
    }
    return result;
}