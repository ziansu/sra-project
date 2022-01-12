void downloadLast() {
    de.blau.android.Logic.getDelegator().reset();
    for (de.blau.android.osm.BoundingBox box : de.blau.android.Logic.getDelegator().getBoundingBoxes()) {
        if ((box != null) && (box.isValidForApi()))
            downloadBox(box, true, null);
        
    }
}