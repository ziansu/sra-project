java.lang.String getMovieRatingString() {
    if ((mMovieRatingNum) == 1) {
        return "Disliked";
    }else
        if ((mMovieRatingNum) == 2) {
            return "Haven't Seen";
        }else
            if ((mMovieRatingNum) == 3) {
                return "Liked";
            }else {
                return "";
            }
        
    
}