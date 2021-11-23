private boolean processRating(model.User user, int rateIndex, int ratingValue) {
    model.Rating rating = model.Rating.valueOf(ratingValue);
    if (rating != (model.Rating.INVALID)) {
        model.RecommendedPointOfInterest recommendedPointOfInterest = user.getUnratedPOIs().get(rateIndex);
        userRatingHandler.saveRating(user.getId(), recommendedPointOfInterest.getId(), model.Rating.valueOf(ratingValue));
        user.getUnratedPOIs().remove(rateIndex);
        return true;
    }
    return false;
}