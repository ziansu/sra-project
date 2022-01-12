public java.lang.String getGroupname(java.lang.String clientkey, int groupId) {
    if ((!(clientkey.equals(""))) && (groupId != (-1))) {
        int service = getClientServiceByKey(clientkey);
        return serviceList.get(service).groupList.get(groupId);
    }else {
        return "noGroup";
    }
}