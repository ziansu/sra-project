public java.lang.String getGroupname(java.lang.String clientkey, int groupId) {
    if ((!(clientkey.equals(""))) && (groupId != (-1))) {
        tool.out(("GROUPID: " + groupId));
        int service = getClientServiceByKey(clientkey);
        return serviceList.get(service).groupList.get(groupId);
    }else {
        return "noGroup";
    }
}