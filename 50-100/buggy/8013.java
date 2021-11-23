public void done(ca.winnipegtrails.winnipegtrails.UserEggLinks object, com.parse.ParseException e) {
    if (e != null) {
        if (WinnipegTrailsApplication.APPDEBUG) {
            android.util.Log.d(WinnipegTrailsApplication.APPTAG, "An error occurred while querying for user eggs", e);
        }
    }
    android.content.Intent intent = new android.content.Intent(this, ca.winnipegtrails.winnipegtrails.EggActivity.class);
    intent.putExtra("id", egg.getObjectId());
    startActivity(intent);
}