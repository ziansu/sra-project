@java.lang.Override
public void onNext(java.lang.Integer alerts) {
    timber.log.Timber.d(("Total alerts " + alerts));
    if (alerts == 0) {
        return ;
    }
    if ((!userPromptedForRating) && ((alerts % 3) == 0)) {
        promptUserForRating();
    }
    if ((!userRatingSubmitted) && ((alerts % 3) == 0)) {
        promptUserForRating();
    }
}