@org.springframework.web.bind.annotation.RequestMapping(value = "/cs480/createList/{listName}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
java.lang.Boolean createList(@org.springframework.web.bind.annotation.PathVariable(value = "listName")
java.lang.String listName, @org.springframework.web.bind.annotation.RequestParam(value = "creatorUserID")
java.lang.String creatorUserID) {
    com.mongodb.BasicDBList userAccess = new com.mongodb.BasicDBList();
    userAccess.add(creatorUserID);
    com.mongodb.DBObject list = new com.mongodb.BasicDBObject("listName", listName).append("items", new com.mongodb.BasicDBList()).append("userAccess", userAccess).append("itemHistory", new com.mongodb.BasicDBObject()).append("createdBy", creatorUserID);
    listsColl.insert(list);
    java.lang.System.out.println(("Call to createList() :" + (list.toString())));
    return true;
}