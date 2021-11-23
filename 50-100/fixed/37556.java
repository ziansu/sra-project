public java.util.ArrayList<fi.jyu.task3.review.Review> getReviewsList(fi.jyu.task3.movie.Movie movie) {
    java.util.ArrayList<fi.jyu.task3.review.Review> list = new java.util.ArrayList<fi.jyu.task3.review.Review>();
    for (fi.jyu.task3.review.Review review : reviewsList) {
        if ((review != null) && ((review.getMovie()) == movie)) {
            list.add(review);
        }
    }
    return list;
}