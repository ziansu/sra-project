private int calcRating(java.lang.String userId) {
    int total = 0;
    java.util.List<FBLT.domain.rating.Rating> ratingList = ratingService.findRatingByUserId(userId);
    for (FBLT.domain.rating.Rating r : ratingList)
        total += java.lang.Integer.parseInt(r.getRating());
    
    return total / (ratingList.size());
}