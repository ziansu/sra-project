@java.lang.Override
public boolean isServiceTimeValid(java.lang.String serviceTime, int service_type) throws java.lang.Exception {
    java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm");
    java.util.Date date = format.parse(serviceTime);
    int startTime = date.getHours();
    com.liuliume.portal.entity.HairdressingTime ht = hairdressingTimeDao.getHairdressingTimeByStartTime(startTime);
    if (ht != null) {
        int sum = ht.getServicePersionNum();
        int count = countHairDressingOrders(date, startTime);
        if (sum > count)
            return true;
        
        return false;
    }
    return false;
}