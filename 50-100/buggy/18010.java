public static java.util.List<classified.classifiedbuzzmovieselector.model.UserRating> getUserRatingsByMajor(java.lang.String major, java.util.List<classified.classifiedbuzzmovieselector.model.UserRating> ratingList) {
    java.util.List<classified.classifiedbuzzmovieselector.model.UserRating> returnVal = new java.util.ArrayList<>();
    for (classified.classifiedbuzzmovieselector.model.UserRating ur : ratingList) {
        if (ur.getUser().getMajor().equals(major)) {
            returnVal.add(ur);
        }
    }
    return returnVal;
}