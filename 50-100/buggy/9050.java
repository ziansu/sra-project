public void sendData(java.util.ArrayList<com.monolc.felljs.Client> clients) {
    if (!(validated)) {
        return ;
    }
    java.lang.String entityData = server.world.toString();
    java.lang.System.out.println(entityData);
    connection.send(("pos:" + (e)));
    if ((entityData.length()) > 0) {
        connection.send(((("dat" + (getDataStride())) + ":") + entityData));
    }
}