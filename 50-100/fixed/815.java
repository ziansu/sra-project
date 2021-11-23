@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    java.util.ArrayList<java.lang.String> value = treeViewDialog.getValue();
    if ((value != null) && ((value.size()) > 0)) {
        org.json.JSONArray array = new org.json.JSONArray(value);
        org.json.JSONArray name = new org.json.JSONArray(treeViewDialog.getName());
        com.vijay.jsonwizard.widgets.TreeViewFactory.changeEditTextValue(editText, array.toString(), name.toString());
    }
}