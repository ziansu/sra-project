@java.lang.Override
public void run() {
    try {
        inputStream = socket.getInputStream();
        dataInputStream = new java.io.DataInputStream(inputStream);
        java.lang.System.out.println("InSignalreciver before accept");
        org.json.JSONObject acceptObject = new org.json.JSONObject(dataInputStream.readUTF());
        java.lang.System.out.println("InSignalreciver after accept");
        {
            java.lang.System.out.println("User Accepted !!!");
            callBack.requestAccepted();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}