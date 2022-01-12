private void send() {
    if (teamNumber.getText().toString().trim().isEmpty())
        return ;
    
    if (!(getDatabaseContent().isEmpty())) {
        Write(getDatabaseContent());
        clearDatabase();
    }
    Write(getValues());
    teamNumber.setText("");
    notes.setText("");
}