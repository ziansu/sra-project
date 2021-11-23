@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.widget.Toast.makeText(getApplicationContext(), ("You selected " + (categ[which])), Toast.LENGTH_SHORT).show();
    companyCategory = categ[which];
    android.widget.EditText categoryTxt = ((android.widget.EditText) (getView().findViewById(R.id.add_company_category)));
    categoryTxt.setText(companyCategory);
}