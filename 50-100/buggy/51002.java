@java.lang.Override
public void done(java.util.List<com.parse.ParseObject> parseObjects, com.parse.ParseException e) {
    if (e == null) {
        android.widget.Toast.makeText(this, "UPLOADING IMAGES TO CLOUD", Toast.LENGTH_SHORT).show();
        android.util.Log.d("UPLOADING IMAGES TO CLOUD", (((tripname) + " - FOUND :: ") + (parseObjects.size())));
        for (com.parse.ParseObject obj : parseObjects) {
            obj.put("trip", trip.getObjectId());
            obj.saveInBackground();
            obj.unpinInBackground(tripname);
        }
    }
}