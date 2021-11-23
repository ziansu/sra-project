@java.lang.Override
protected java.util.Hashtable<java.lang.Integer, com.dev.callofbeer.models.EventBeer> doInBackground(java.util.ArrayList<com.google.android.gms.maps.model.LatLng>... params) {
    java.util.ArrayList<com.dev.callofbeer.models.EventBeer> eventBeerArrayList = com.dev.callofbeer.network.API.getEvents(params[0]);
    for (com.dev.callofbeer.models.EventBeer eventBeer : eventBeerArrayList) {
        if (!(allEventBeers.containsKey(eventBeer.getId())))
            allEventBeers.put(eventBeer.getId(), eventBeer);
        
    }
    return allEventBeers;
}