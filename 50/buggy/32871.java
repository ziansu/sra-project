public void refresh(android.view.View view) {
    clearCurrentBusMarkers();
    try {
        busLocationRequest();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}