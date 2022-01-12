private void restartLoader(java.lang.String s) {
    java.util.Random random = new java.util.Random();
    com.example.oluwatimilehin.moviebuff.main.MovieActivity.MOVIE_LOADER_ID = anyRandomInt(random);
    bundle.putString("query", s);
    if ((getSupportLoaderManager().getLoader(com.example.oluwatimilehin.moviebuff.main.MovieActivity.MOVIE_LOADER_ID)) != null) {
        getSupportLoaderManager().restartLoader(com.example.oluwatimilehin.moviebuff.main.MovieActivity.MOVIE_LOADER_ID, bundle, new com.example.oluwatimilehin.moviebuff.main.MovieActivity.MovieDataLoader());
    }else {
        getSupportLoaderManager().initLoader(com.example.oluwatimilehin.moviebuff.main.MovieActivity.MOVIE_LOADER_ID, bundle, new com.example.oluwatimilehin.moviebuff.main.MovieActivity.MovieDataLoader());
    }
}