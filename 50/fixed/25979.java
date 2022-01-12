public void removeRoles(by.tasktracker.core.models.User user) {
    execute(("DELETE FROM users_roles WHERE user_id = " + (user.getId())));
}