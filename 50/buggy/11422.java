@java.lang.Override
public void onFailure(retrofit2.Call<com.example.android.popularmoviesstagetwo.model.MoviesListResponse> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(getContext(), getString(R.string.internet_connection_message), Toast.LENGTH_SHORT).show();
}