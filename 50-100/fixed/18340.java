public void updateUsers() {
    usersById.clear();
    codeu.chat.client.ClientUser.usersByName.clear(codeu.chat.client.ClientUser.STORE_FILENAME);
    for (final codeu.chat.common.User user : view.getUsersExcluding(codeu.chat.client.ClientUser.EMPTY)) {
        usersById.put(user.id, user);
        codeu.chat.client.ClientUser.usersByName = codeu.chat.client.ClientUser.usersByName.insert(user.name, user, true);
    }
}