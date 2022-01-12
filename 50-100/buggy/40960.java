private long loadSearchListFromDisk() {
    java.lang.String fileName = "list";
    java.lang.String listStr = null;
    if (com.venomyd.nopay.timetable.Services.FileAPI.isFileExists(getBaseContext(), fileName)) {
        listStr = com.venomyd.nopay.timetable.Services.FileAPI.readFile(getBaseContext(), fileName);
    }
    searchList = com.venomyd.nopay.timetable.Services.JSONParser.parseSearchList(listStr);
    sendSearchList();
    return com.venomyd.nopay.timetable.Services.JSONParser.getSearchListTsp(listStr);
}