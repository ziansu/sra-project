private void trackAndFirePulse(it.near.sdk.geopolis.Node node, it.near.sdk.geopolis.trackings.Events.GeoEvent event) {
    if ((node != null) && ((node.identifier) != null)) {
        try {
            geopolisTrackingsManager.trackEvent(node.identifier, event);
        } catch (org.json.JSONException e) {
        }
        firePulse(event, node.tags, node.identifier);
    }
}