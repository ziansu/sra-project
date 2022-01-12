@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String toAdd = commenting.getText().toString();
    if ((toAdd != null) && (!(toAdd.equals("")))) {
        adapter.add(toAdd);
    }
    commenting.setText("");
}