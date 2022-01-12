@java.lang.Override
protected com.google.android.gms.maps.UiSettings setMapUISetting(com.google.android.gms.maps.GoogleMap googleMap) {
    firebaseHandler = new com.batp.logisticbuddy.helper.FirebaseHandler();
    firebaseHandler.initDatabaseReferrence();
    driverDatas = new java.util.ArrayList<>();
    com.batp.logisticbuddy.model.DriverData data = new com.batp.logisticbuddy.model.DriverData();
    data.setDriverName("Bejo");
    driverDatas.add(data);
    data = new com.batp.logisticbuddy.model.DriverData();
    data.setDriverName("Paijo");
    driverDatas.add(data);
    return null;
}