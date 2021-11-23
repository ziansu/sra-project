private void validateInputs() {
    java.lang.String projectId = projectIdWidget.getText().toString();
    if ((projectId.length()) == 5) {
        try {
            writeProjectInDb();
        } catch (android.database.sqlite.SQLiteConstraintException e) {
            setErrorMessageToWidget(projectIdWidget, "ID is already registered in the database.");
        } catch (java.sql.SQLException e) {
            android.widget.Toast.makeText(this, "Could not create new project due to database errors!", Toast.LENGTH_SHORT).show();
        }
        finishActivityAndShowAnimation();
    }else {
        setErrorMessageToWidget(projectIdWidget, "Your project ID must consist of 5 digits");
    }
}