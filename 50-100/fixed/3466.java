@java.lang.Override
public void onFailure(retrofit2.Call<de.m4lik.burningseries.api.objects.EpisodeObj> call, java.lang.Throwable t) {
    android.support.design.widget.Snackbar snackbar = android.support.design.widget.Snackbar.make(rootview, "Fehler beim laden der Hoster.", Snackbar.LENGTH_SHORT);
    android.view.View snackbarView = snackbar.getView();
    snackbarView.setBackgroundColor(android.support.v4.content.ContextCompat.getColor(getContext(), R.color.colorPrimaryDark));
    snackbar.show();
}