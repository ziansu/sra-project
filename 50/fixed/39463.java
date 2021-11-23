public static ClientList instance() {
    if ((ClientList.clientList) == null) {
        return ClientList.clientList = new ClientList();
    }else {
        return ClientList.clientList;
    }
}