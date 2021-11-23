@java.lang.Override
public void done(java.util.List<com.parse.ParseObject> objects, com.parse.ParseException e) {
    for (com.parse.ParseObject object : objects) {
        try {
            object.delete();
            object.saveInBackground();
        } catch (com.parse.ParseException ex) {
            ex.printStackTrace();
        }
    }
}