@java.lang.Override
public int compare(edu.gatech.cs2340.nochill.models.MovieItem movieItem, edu.gatech.cs2340.nochill.models.MovieItem t1) {
    return ((int) (java.lang.Math.round(((movieItem.getAverageRating()) - (t1.getAverageRating())))));
}