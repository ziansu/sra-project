public void markCompleted() {
    this.completed = true;
    int pointsToAdd = ((int) (((10 * (Task.POINT_RANGE[((this.importance) - 1)])) * (Task.POINT_RANGE[((this.difficulty) - 1)])) * (calculateEstimatedTimeMultiplier(this.estimated_time))));
    User currentUser = User.findUser(this.user_id);
    int oldExp = currentUser.getUserExperience();
    currentUser.updateUserExperience((oldExp + pointsToAdd));
}