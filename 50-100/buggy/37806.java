@java.lang.Override
public void recordHotSpot() {
    super.recordHotSpot();
    final java.util.List<com.sdp.manager.hotspotmanager.HotSpotItem> list = new java.util.ArrayList<com.sdp.manager.hotspotmanager.HotSpotItem>();
    java.util.Map<java.lang.String, java.lang.Integer> map = frequentDetector.getCurrentHotSpot();
    for (java.lang.String key : map.keySet()) {
        list.add(new com.sdp.manager.hotspotmanager.HotSpotItem(key, map.get(key)));
    }
    recordCurrentHotSpot(list);
}