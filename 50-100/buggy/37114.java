public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (((freqStops) == null) || (position >= (freqStops.size())))
        return ;
    
    org.shadowlands.roadtrip.db.FreqTripTStop stop = freqStops.get(position);
    android.widget.Toast.makeText(this, ("got stop id " + (stop.getID())), Toast.LENGTH_SHORT).show();
    finish(stop.getID());
}