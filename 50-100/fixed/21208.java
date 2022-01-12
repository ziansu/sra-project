@java.lang.Override
public void onResponse(retrofit2.Call<com.mutualmobile.barricade.sample.api.model.Joke> call, retrofit2.Response<com.mutualmobile.barricade.sample.api.model.Joke> response) {
    if (response.isSuccessful()) {
        jokeTextView.setText(response.body().value);
    }else {
        jokeTextView.setText(("Request failed : " + (response.code())));
    }
    showProgress(false);
}