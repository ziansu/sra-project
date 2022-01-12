public static labfinder.BasicDBObject generateRoomFilter(java.util.List<java.lang.String> list) {
    labfinder.BasicDBList or = new labfinder.BasicDBList();
    labfinder.BasicDBObject tmpObj;
    for (java.lang.String str : list) {
        java.lang.System.out.println(str);
        tmpObj = new labfinder.BasicDBObject("Room", str);
        or.add(tmpObj);
    }
    labfinder.BasicDBObject filter = new labfinder.BasicDBObject("$nor", or);
    return filter;
}