public static void getPoster(android.content.Context context, java.lang.String path, int width, int height, com.squareup.picasso.Target target) {
    com.squareup.picasso.Picasso.with(context).load(((ru.surf.course.movierecommendations.tmdbTasks.ImageLoader.TMDB_BASE_POSTER_URL) + path)).noFade().resize(250, 375).centerCrop().into(target);
}