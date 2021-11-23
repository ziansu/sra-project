public void addUser(int userNr, be.kdg.sokoban.model.User user) {
    users.set((userNr - 1), user);
}