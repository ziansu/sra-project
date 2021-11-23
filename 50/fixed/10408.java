private void checkNotRemoved(wad.domain.Activity activity) {
    java.lang.String activityName = activity.getName();
    assertNotEquals(0, activity.getAttendeeCount());
    wad.domain.Activity repoActivity = activityRepository.findByName(activityName);
    assertNotNull(repoActivity);
}