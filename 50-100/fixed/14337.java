private void clearMarker() {
    if ((marker_id) != null) {
        for (java.util.Map.Entry<com.google.android.gms.maps.model.Marker, java.lang.String> entry : marker_id.entrySet()) {
            try {
                marker_id.remove(entry.getKey());
                marker_title.remove(entry.getKey());
                marker_content.remove(entry.getKey());
                entry.getKey().remove();
            } catch (java.lang.Exception e) {
                continue;
            }
        }
    }
    addOwnSite();
}