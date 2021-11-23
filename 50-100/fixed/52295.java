private int calcRating(java.lang.String userId) {
    int total = 0;
    java.util.List<FBLT.domain.rating.Rating> ratingList = ratingService.findRatingByUserId(userId);
    if ((ratingList.size()) != 0) {
        for (FBLT.domain.rating.Rating r : ratingList) {
            total += java.lang.Integer.parseInt(r.getRating());
        }
        return total / (ratingList.size());
    }
    return total;
}