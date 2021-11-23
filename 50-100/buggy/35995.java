@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        this.getIntent().putExtra(Trailsystem.ID_EXTRA, trailsystem.ID());
        this.setResult(com.brentandjody.mountainunicyclist.RESULT_OK);
        this.finish();
    }else
        android.util.Log.e("Trailsystem Save", e.getMessage());
    
}