public void refresh() {
    android.content.SharedPreferences pref = getSharedPreferences(fr.natinusala.openedt.activity.MainActivity.SCRAPPER_SAVE, 0);
    java.lang.String grpName = pref.getString("groupName", "Inconnu");
    setTitle(((fr.natinusala.openedt.activity.MainActivity.TITLE) + grpName));
    com.rey.material.widget.ProgressView pv = ((com.rey.material.widget.ProgressView) (findViewById(R.id.progress_circle)));
    pv.setVisibility(View.VISIBLE);
    new fr.natinusala.openedt.activity.MainActivity.Task(true).execute();
}