private void restoreUser(codeu.chat.common.User user) {
    currentUserGeneration = userGenerations.make();
    userById.insert(user.id, user);
    userByTime.insert(user.creation, user);
    userByText.insert(user.name, user);
}