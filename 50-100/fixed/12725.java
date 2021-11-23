private boolean executeTIMEZONE_LIST() {
    int listIndex = getListArg(com.rfo.basic.Run.list_is_string);
    if (listIndex < 0)
        return false;
    
    if (!(checkEOL()))
        return false;
    
    java.util.ArrayList<java.lang.String> theList = new java.util.ArrayList<java.lang.String>();
    com.rfo.basic.Run.theLists.set(listIndex, theList);
    for (java.lang.String zone : java.util.TimeZone.getAvailableIDs()) {
        theList.add(zone);
    }
    return true;
}