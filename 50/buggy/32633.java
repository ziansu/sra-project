void addItem(com.cfd.map.mohit.locationalarm.activities.GeoAlarm dataObj, int index) {
    mAlarms.add(dataObj);
    notifyItemInserted(index);
}