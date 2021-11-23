@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String userTypeStr = parent.getItemAtPosition(position).toString();
    android.util.Log.e("USER TYPE: ", ("USER TYPE: " + userTypeStr));
    if (userTypeStr.equalsIgnoreCase("Student")) {
        userTypeIDStr = "2";
    }else
        if (userTypeStr.equalsIgnoreCase("Staff")) {
            userTypeIDStr = "1";
        }
    
}