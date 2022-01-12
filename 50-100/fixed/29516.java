public static java.util.List<classified.classifiedbuzzmovieselector.model.UserRating> getUserRatingsByFriends(classified.classifiedbuzzmovieselector.model.User user, java.util.List<classified.classifiedbuzzmovieselector.model.UserRating> ratingList) {
    java.util.List<classified.classifiedbuzzmovieselector.model.UserRating> returnVal = new java.util.ArrayList<>();
    for (classified.classifiedbuzzmovieselector.model.UserRating ur : classified.classifiedbuzzmovieselector.model.UserRatingManager.userRatings) {
        if (user.getName().equals(ur.getUser().getName())) {
            returnVal.add(ur);
        }
    }
    return returnVal;
}