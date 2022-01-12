@java.lang.Override
public java.lang.Boolean handle(final com.tocea.corolla.users.commands.DeleteUserCommand _command) {
    final com.tocea.corolla.users.domain.User user = this.userDAO.findUserByLogin(_command.getUserLogin());
    final java.lang.Boolean found = user != null;
    com.tocea.corolla.users.handlers.DeleteUserCommandHandler.LOGGER.info("Delete user {}", user.getLogin());
    this.userDAO.deleteUserByLogin(user.getLogin());
    return found;
}