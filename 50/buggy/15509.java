@java.lang.Override
public io.reactivex.Single<java.util.List<com.example.alexander.weatherapp.data.network.models.places.Prediction>> getAutocomplete(java.lang.String query, java.lang.String lang) {
    return googlePlacesApi.getAutocomplete(query, lang).map(PredictionsResponse::getPredictions);
}