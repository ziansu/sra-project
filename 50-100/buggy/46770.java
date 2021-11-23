private void processLogin(database.Message obj) {
    database.Message obj1 = new database.Message();
    obj1.setMessageID(1);
    if (sd.Authenticate_Login(obj.getUser(), obj.getPassword())) {
        obj1.setMessage("Authenticated");
    }else {
        obj1.setMessage("Not Authenticated");
    }
    try {
        serverOutputStream.writeObject(obj1);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}