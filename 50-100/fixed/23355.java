@java.lang.Override
public void notifyUnfollowBusiness(int businessId) {
    buttonFollowStatus.setBackgroundColor(activity.getResources().getColor(R.color.primaryColor));
    buttonFollowStatus.setText(activity.getString(R.string.follow));
    buttonFollowStatus.setTextColor(activity.getResources().getColor(R.color.white));
    business.isFollowing = false;
    (business.followersNumber)--;
    textViewFollowersNumber.setText(java.lang.String.valueOf(business.followersNumber));
    ir.rasen.charsoo.controller.object.MyApplication.broadCastReloadTimeline();
}