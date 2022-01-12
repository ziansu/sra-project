@java.lang.Override
public void remove(long id) {
    com.tonyodev.fetch2.RequestData requestData = readDatabase.query(id);
    if (requestData != null) {
        java.util.List<com.tonyodev.fetch2.RequestData> list = new java.util.ArrayList<>(1);
        list.add(requestData);
        remove(list);
    }
}