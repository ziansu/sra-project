@java.lang.Override
public int compareTo(ga.neerajdelima.themovieapp.model.Movie o) {
    if (o == null) {
        throw new java.lang.NullPointerException("Specified object is null.");
    }
    if (o == (this)) {
        return 0;
    }
    double thisAverageRating = (this.totalRating) / (this.ratingCount);
    double thatAverageRating = (o.totalRating) / (o.ratingCount);
    if (thisAverageRating < thatAverageRating) {
        return -1;
    }else
        if (thisAverageRating > thatAverageRating) {
            return 1;
        }
    
    return 0;
}