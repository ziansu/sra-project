@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent sendIntent = new android.content.Intent(context, com.example.android.popularmovies.service.MovieService.class);
    sendIntent.putExtra(com.example.android.popularmovies.service.MovieService.MOIVE_QUERY_CRITERIA, intent.getStringExtra(com.example.android.popularmovies.service.MovieService.MOIVE_QUERY_CRITERIA));
    context.startService(intent);
}