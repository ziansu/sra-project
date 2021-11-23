java.lang.String getMovieRatingString() {
    if ((mMovieRatingNum) == 1) {
        return "Liked";
    }else
        if ((mMovieRatingNum) == 2) {
            return "Haven't Seen";
        }else
            if ((mMovieRatingNum) == 3) {
                return "Disliked";
            }else {
                return "";
            }
        
    
}