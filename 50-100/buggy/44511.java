public void snapshot(final nl.rsdt.japp.jotial.maps.wrapper.JotiMap.SnapshotReadyCallback snapshotReadyCallback) {
    switch (mapType) {
        case nl.rsdt.japp.jotial.maps.wrapper.JotiMap.GOOGLEMAPTYPE :
            googleMap.snapshot(new com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback() {
                @java.lang.Override
                public void onSnapshotReady(android.graphics.Bitmap bitmap) {
                    snapshotReadyCallback.onSnapshotReady(bitmap);
                }
            });
            break;
        case nl.rsdt.japp.jotial.maps.wrapper.JotiMap.OSMMAPTYPE :
            android.graphics.Bitmap bm = android.graphics.BitmapFactory.decodeResource(nl.rsdt.japp.application.Japp.getAppResources(), R.drawable.about_bram);
            snapshotReadyCallback.onSnapshotReady(bm);
            break;
        default :
            break;
    }
}