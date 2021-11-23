private int isPopular(com.m3libea.flickster.models.Movie movie) {
    if ((movie.getStars()) > 5) {
        return 0;
    }else {
        return 1;
    }
}