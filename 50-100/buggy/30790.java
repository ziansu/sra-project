public void getGenres(android.content.Context context, android.widget.GridView gridView, android.widget.ProgressBar progressBar, android.widget.TextView txtNoGenres, java.util.List<java.lang.String> preselected) {
    progressBar.setVisibility(progressBar.VISIBLE);
    com.melodies.bandup.DatabaseSingleton.getInstance(context).getBandUpDatabase().getGenres(getSetupItemsListener(context, gridView, progressBar, txtNoGenres, preselected), getSetupItemsErrorListener(context, progressBar));
}