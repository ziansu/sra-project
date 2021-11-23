private void saveDataIfNeeded() {
    if (!(updatingMethods().contains(request.getMethod().name()))) {
        return ;
    }
    for (java.lang.String key : request.dataKeys()) {
        store.write(key, request.readData(key));
    }
}