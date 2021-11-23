private apps.scvh.com.whattodo.util.essences.Movie pickBestMovie(java.util.HashSet<apps.scvh.com.whattodo.util.essences.Movie> movies) {
    java.util.Iterator<apps.scvh.com.whattodo.util.essences.Movie> moviesIterator = movies.iterator();
    apps.scvh.com.whattodo.util.essences.Movie nextMovie;
    while (moviesIterator.hasNext()) {
        nextMovie = moviesIterator.next();
        countScore(nextMovie);
    } 
    apps.scvh.com.whattodo.util.essences.Movie finalMovie = java.util.Collections.max(movies);
    return finalMovie;
}