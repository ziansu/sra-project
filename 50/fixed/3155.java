public java.util.List<de.footballclashers.beans.GroupDetails> listOfGroupsPartOfUser(java.lang.String email) {
    java.util.Map<java.lang.String, java.lang.Object> dataMap = new java.util.HashMap<java.lang.String, java.lang.Object>();
    dataMap.put("email", email);
    return userGroup.listOfGroupsPartOfUser(dataMap);
}