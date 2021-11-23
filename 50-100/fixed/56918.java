public void onClick(android.content.DialogInterface dialog, int id) {
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    java.lang.String newName = inputName.getText().toString();
    java.lang.String valueText = inputBPM.getText().toString();
    if ((!(sharedPref.contains(newName))) || (newName.equals(name))) {
        submitEdit(newName, valueText, editor, adapter, false);
    }else
        edit_sameName(context, adapter, sharedPref, newName, valueText);
    
}