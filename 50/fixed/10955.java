@java.lang.Override
@android.support.annotation.NonNull
public synchronized java.util.Iterator<cgeo.geocaching.maps.mapsforge.v6.caches.GeoitemLayer> iterator() {
    return new java.util.ArrayList(this.geoitems.values()).iterator();
}