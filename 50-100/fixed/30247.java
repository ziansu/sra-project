public net.binarycreations.apod.domain.AstroPick requestAstronomyPick(org.threeten.bp.LocalDate day) throws java.io.IOException, net.binarycreations.apod.client.ApiError {
    com.squareup.okhttp.Request request = new com.squareup.okhttp.Request.Builder().url((((((net.binarycreations.apod.client.NasaApodClient.APOD_API_URL) + "?api_key=") + (mApiKey)) + "&date=") + (day.toString()))).build();
    com.squareup.okhttp.Response response = mClient.newCall(request).execute();
    return parseResponse(response, day);
}