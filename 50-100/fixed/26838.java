public void run() {
    io.github.getExposure.database.Comment c = new io.github.getExposure.database.Comment(userID, locationID, com.facebook.Profile.getCurrentProfile().getName(), content, new java.util.Date(), new java.sql.Time(0));
    long result = m.insert(c);
    android.util.Log.d("BUENOs", ("" + result));
}