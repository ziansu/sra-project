public void sendObjectToAllRecursively(java.lang.Object o, java.util.ArrayList<server.ConnectionInstance> list) {
    if ((list.size()) == 0) {
        return ;
    }
    list.get(((list.size()) - 1)).sendObject(o);
    sendObjectToAllRecursively(o, list);
}