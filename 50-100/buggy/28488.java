public void adding(android.view.View view) {
    java.lang.String name = classificationEntry.getText().toString();
    if (!(software.unf.dk.timetracker.Classification.createNew(name))) {
        android.widget.Toast.makeText(this, "Category already exists!", Toast.LENGTH_LONG).show();
        return ;
    }
    setSpinner();
    classificationEntry.setText("");
}