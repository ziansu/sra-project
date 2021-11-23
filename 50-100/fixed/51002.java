@java.lang.Override
public void done(java.util.List<com.parse.ParseObject> parseObjects, com.parse.ParseException e) {
    if (e == null) {
        android.util.Log.d("UPLOADING IMAGES TO CLOUD", (((tripname) + " - FOUND :: ") + (parseObjects.size())));
        for (com.parse.ParseObject obj : parseObjects) {
            obj.put("trip", trip.getObjectId());
            obj.saveInBackground();
            obj.unpinInBackground(tripname);
        }
    }
}