public void addControl(it.geosolutions.android.map.control.MapControl m) {
    synchronized(controls) {
        controls.add(m);
    }
    android.util.Log.v("CONTROL", ("total controls:" + (controls.size())));
}