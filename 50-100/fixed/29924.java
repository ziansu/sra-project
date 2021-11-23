public void sendObjectToAllRecursively(java.lang.Object o, java.util.ArrayList<server.ConnectionInstance> list) {
    if ((list.size()) == 0) {
        return ;
    }
    server.ConnectionInstance c = list.get(((list.size()) - 1));
    c.sendObject(o);
    list.remove(c);
    sendObjectToAllRecursively(o, list);
}