@java.lang.Override
public void onResumeFragment() {
    if (((user) != null) && ((ratingService) != null)) {
        ratingService.loadUserRatings(this, user.getUserId());
    }
}