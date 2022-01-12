@java.lang.Override
public codeu.chat.common.UserAccessLevel newUserAccessLevel(codeu.chat.util.Uuid conversationId, codeu.chat.util.Uuid userId, codeu.chat.common.AccessLevel accessLevel) {
    final codeu.chat.common.User foundUser = model.userById().first(userId);
    codeu.chat.common.UserAccessLevel userAccess = null;
    if (foundUser != null) {
        userAccess = new codeu.chat.common.UserAccessLevel(userId, accessLevel);
        model.add(conversationId, userAccess);
        codeu.chat.server.Controller.LOG.info(((("AccessLevel " + accessLevel) + " added to user ") + userId));
    }
    return userAccess;
}