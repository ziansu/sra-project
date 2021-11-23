private void remove(wad.domain.Activity activity) {
    java.lang.Long activityID = activity.getId();
    activityController.remove(activityID);
}