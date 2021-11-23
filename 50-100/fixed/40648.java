public com.lm.domain.gen.UserActivity renewBook(int userActivityId) {
    com.lm.domain.gen.UserActivity userActivity = userActivityRepository.findOne(userActivityId);
    userActivity.setDueDate(dueDate());
    userActivity.setBookStatuses(bookStatusesService.findOne(2));
    java.lang.Short count = userActivity.getRenewalCount();
    userActivity.setRenewalCount((++count));
    return userActivityRepository.saveAndFlush(userActivity);
}