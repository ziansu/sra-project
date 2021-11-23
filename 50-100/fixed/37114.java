public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (((freqStops) == null) || (position >= (freqStops.size())))
        return ;
    
    org.shadowlands.roadtrip.db.FreqTripTStop stop = freqStops.get(position);
    finish(stop.getID());
}