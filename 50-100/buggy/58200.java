@java.lang.Override
protected void onStart() {
    super.onStart();
    myData = new com.mycompany.geotracker.MyData(this);
    final java.util.ArrayList<com.mycompany.geotracker.Local> allData = myData.selectAll();
    if ((allData.size()) != 0) {
        userIDStr = allData.get(0).getId();
        passwordStr = allData.get(0).getPassword();
    }
}