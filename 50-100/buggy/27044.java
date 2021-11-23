public int compare(core.accounts.User user1, core.accounts.User user2) {
    if (user1.getLastName().equals(user2.getLastName())) {
        return user1.getFirstName().compareTo(user2.getFirstName());
    }
    return user1.getLastName().compareTo(user2.getLastName());
}