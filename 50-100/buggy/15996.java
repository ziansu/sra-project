private void acquireCoordinate() {
    retrofit2.Call<com.example.kygrykhon.knownuggettrial.Coordinate> call = com.example.kygrykhon.knownuggettrial.MainActivity.apiService.getCoordinate(com.example.kygrykhon.knownuggettrial.MainActivity.permanentKey.getPermKey());
    call.enqueue(new retrofit2.Callback<com.example.kygrykhon.knownuggettrial.Coordinate>() {
        @java.lang.Override
        public void onResponse(retrofit2.Call<com.example.kygrykhon.knownuggettrial.Coordinate> call, retrofit2.Response<com.example.kygrykhon.knownuggettrial.Coordinate> response) {
            coordinateSet(response.body());
        }

        @java.lang.Override
        public void onFailure(retrofit2.Call<com.example.kygrykhon.knownuggettrial.Coordinate> call, java.lang.Throwable t) {
        }
    });
}