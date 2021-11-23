public void onResponse(retrofit2.Call<com.igorko.accesibleif.models.Data> call, retrofit2.Response<com.igorko.accesibleif.models.Data> response) {
    if ((response.isSuccessful()) && ((response.body()) != null)) {
        if (callback != null) {
            callback.onSuccess(response.body());
        }
    }
}