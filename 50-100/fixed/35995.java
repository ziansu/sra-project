@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e == null) {
        android.content.Intent intent = this.getIntent();
        java.lang.String id = trailsystem.ID();
        intent.putExtra(Trailsystem.ID_EXTRA, id);
        this.setResult(com.brentandjody.mountainunicyclist.RESULT_OK, intent);
        this.finish();
    }else
        android.util.Log.e("Trailsystem Save", e.getMessage());
    
}