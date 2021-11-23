private static ua.dirproy.profelumno.common.models.Review generateReview(int i, java.util.Date date) {
    int stars = new java.util.Random().nextInt(10);
    ua.dirproy.profelumno.common.models.Review review = new ua.dirproy.profelumno.common.models.Review();
    review.setComment((i == 1 ? ua.dirproy.profelumno.Global.InitialData.generateReviewsT()[stars] : ua.dirproy.profelumno.Global.InitialData.generateReviewsS()[stars]));
    review.setDate(date);
    review.setStars(((long) (stars / 2)));
    review.save();
    return review;
}