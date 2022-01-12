public void deleteUser(java.lang.String name) {
    if (codeu.chat.client.ClientUser.usersByName.containsValue(name)) {
        codeu.chat.common.User userObject = codeu.chat.client.ClientUser.usersByName.first(name);
        for (java.util.Map.Entry<codeu.chat.common.Uuid, codeu.chat.common.User> entry : usersById.entrySet()) {
            codeu.chat.common.Uuid id = entry.getKey();
            codeu.chat.common.User user = entry.getValue();
            if ((user.name) == (userObject.name)) {
                usersById.remove(id);
                codeu.chat.client.ClientUser.usersByName.remove(userObject.name);
            }
        }
    }
}