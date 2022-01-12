public java.util.Date getFirstDateUpdated() {
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd' 'HH:mm");
    java.lang.String dateString = null;
    java.util.Date d;
    if ((mStatusList.size()) != 0)
        dateString = mStatusList.get(((mStatusList.size()) - 1)).mTime;
    
    try {
        d = format.parse(dateString);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
    return d;
}