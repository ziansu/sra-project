void addTunesToTuneListScreen(java.util.ArrayList<java.lang.String> tuneNamesArray) {
    if (((tuneLinks.size()) < 1) && ((recursions) < 5)) {
        searchForTunes("remote");
        (recursions)++;
        return ;
    }
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.company.rorywalsh.folkthis.TuneListScreen.class);
    i.putExtra("location", fileLocation);
    i.putStringArrayListExtra("tuneNames", tuneNames);
    i.putStringArrayListExtra("tuneLinks", tuneLinks);
    startActivity(i);
}