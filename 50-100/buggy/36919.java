ru.yakovburtsev.socialnetwork.core.model.User get(java.lang.Long id) {
    log.info(("get user id=" + id));
    userMessageSender.sendId(id, ru.yakovburtsev.socialnetwork.webclient.controller.AbstractUserController.GET_USER, ru.yakovburtsev.socialnetwork.webclient.controller.AbstractUserController.TRUE);
    ru.yakovburtsev.socialnetwork.core.model.User user = userMessageReceiver.receive(((ru.yakovburtsev.socialnetwork.webclient.controller.AbstractUserController.GET_USER_SELECTOR) + (ru.yakovburtsev.socialnetwork.webclient.controller.AbstractUserController.quoted(id))));
    log.info(("got user " + user));
    return user;
}