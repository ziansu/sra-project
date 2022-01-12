public codeu.chat.common.User newUser(codeu.chat.util.Uuid id, java.lang.String name, java.lang.String password, codeu.chat.common.Time creationTime) {
    codeu.chat.common.User user = null;
    if (isIdFree(id)) {
        user = new codeu.chat.common.User(id, name, creationTime);
        model.add(user, password);
        codeu.chat.server.Controller.LOG.info("newUser with password success (user.id=%s user.name=%s user.time=%s)", id, name, creationTime);
    }else {
        codeu.chat.server.Controller.LOG.info("newUser fail - id in use (user.id=%s user.name=%s user.time=%s)", id, name, creationTime);
    }
    return user;
}