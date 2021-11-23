public synchronized void syncNewDriver(java.lang.String name, java.lang.String street, java.lang.String city, java.lang.String state, java.lang.String zip) {
    com.example.android.rowanparkingpass.Networking.SendInfo.SendInfoDriver sendInfoDriver = new com.example.android.rowanparkingpass.Networking.SendInfo.SendInfoDriver();
    org.json.JSONObject json;
    int oldID = db.addDriver(name, street, city, arrayOfStates[java.lang.Integer.parseInt(state)].valueOf(arrayOfStates[java.lang.Integer.parseInt(state)].name()).toString(), zip);
    sendInfoDriver.addDriver(oldID, name, street, city, state, zip);
    return ;
}