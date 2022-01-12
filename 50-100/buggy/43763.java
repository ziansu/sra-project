public com.google.android.gms.maps.model.PolylineOptions getPolylineOptionsByStoryId(java.lang.String id) {
    com.google.android.gms.maps.model.PolylineOptions storyLine = new com.google.android.gms.maps.model.PolylineOptions();
    de.ifgi.igiapp.igi_app.MongoDB.Story story = getStoryByStoryId(id);
    for (java.lang.String storyElementId : story.getStoryElementId()) {
        de.ifgi.igiapp.igi_app.MongoDB.StoryElement storyElement = getStoryElementByStoryElementId(storyElementId);
        java.lang.String poiId = storyElement.getPoiId();
        de.ifgi.igiapp.igi_app.MongoDB.Poi poi = getPoiByPoiId(poiId);
        storyLine.add(poi.getLocation());
    }
    return storyLine;
}