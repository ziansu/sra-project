@java.lang.Override
public int compare(edu.gatech.cs2340.nochill.models.MovieItem movieItem, edu.gatech.cs2340.nochill.models.MovieItem t1) {
    return (movieItem.getMajorRating(major)) > (t1.getMajorRating(major)) ? -1 : 1;
}