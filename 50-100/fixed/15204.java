public void onClick(android.content.DialogInterface dialog, int id) {
    locationText.setText(input.getText().toString());
    com.dbl_appdevelopment.group2.todomaster.model.QueryLocation queryLocation = new com.dbl_appdevelopment.group2.todomaster.model.QueryLocation(input.getText().toString());
    com.dbl_appdevelopment.group2.todomaster.model.ConcreteLocation concreteLocation = new com.dbl_appdevelopment.group2.todomaster.model.ConcreteLocation(queryLocation.getKeyword());
    updateLocation(concreteLocation);
    setTravelTime(queryLocation);
}