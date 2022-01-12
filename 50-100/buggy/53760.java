private boolean processRating(model.User user, int rateIndex, int ratingValue) {
    model.RecommendedPointOfInterest recommendedPointOfInterest = user.getUnratedPOIs().get(rateIndex);
    user.getUnratedPOIs().remove(rateIndex);
    model.Rating rating = model.Rating.valueOf(ratingValue);
    if (rating != (model.Rating.INVALID)) {
        userRatingHandler.saveRating(user.getId(), recommendedPointOfInterest.getId(), model.Rating.valueOf(ratingValue));
        return true;
    }
    return false;
}