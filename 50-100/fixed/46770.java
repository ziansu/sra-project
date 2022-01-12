private void processLogin(database.Message obj) {
    database.Message obj1 = new database.Message();
    obj1.setMessageID(1);
    obj1.setMessage(sd.Authenticate_Login(obj.getUser(), obj.getPassword()));
    try {
        serverOutputStream.writeObject(obj1);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}