private void remove(wad.domain.Activity activity) {
    java.lang.String activityID = activity.getId();
    activityController.remove(activityID);
}