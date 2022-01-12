java.util.List<ru.yakovburtsev.socialnetwork.core.model.UserInfo> findByNameAndSurname(java.lang.String name, java.lang.String surname) {
    log.info("find by name={} and surname={}", name, surname);
    ru.yakovburtsev.socialnetwork.core.model.UserInfo userInfo = new ru.yakovburtsev.socialnetwork.core.model.UserInfo();
    userInfo.setName(name);
    userInfo.setSurname(surname);
    userInfoMessageSender.send(userInfo, ru.yakovburtsev.socialnetwork.webclient.controller.AbstractUserController.FIND_USERS, ru.yakovburtsev.socialnetwork.webclient.controller.AbstractUserController.TRUE);
    return userInfoMessageReceiver.receiveList(((ru.yakovburtsev.socialnetwork.webclient.controller.AbstractUserController.FIND_USERS_SELECTOR) + (ru.yakovburtsev.socialnetwork.webclient.controller.AbstractUserController.quoted(((name + " ") + surname)))));
}