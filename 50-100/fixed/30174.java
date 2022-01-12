@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.util.List<com.example.lazar.getmethere.model.api.AirportAutoComplete> result = intent.getParcelableArrayListExtra("RESULT");
    switch (intent.getIntExtra("SOURCE", (-1))) {
        case com.example.lazar.getmethere.activity.SearchFlightsActivity.ORIGIN :
            origin.setAdapter(new com.example.lazar.getmethere.providers.adapters.AirportAutocompleteAdapter(this, 0, result));
            break;
        case com.example.lazar.getmethere.activity.SearchFlightsActivity.DESTINATION :
            destination.setAdapter(new com.example.lazar.getmethere.providers.adapters.AirportAutocompleteAdapter(this, 0, result));
            break;
    }
}