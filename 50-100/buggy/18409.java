private void send() {
    if (!(getDatabaseContent().isEmpty())) {
        Write(getDatabaseContent());
        clearDatabase();
    }
    Write(getValues());
    teamNumber.setText("");
    notes.setText("");
}