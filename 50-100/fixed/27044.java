public int compare(core.accounts.User user1, core.accounts.User user2) {
    if (user1.getLastName().toUpperCase().equals(user2.getLastName().toUpperCase())) {
        return user1.getFirstName().toUpperCase().compareTo(user2.getFirstName().toUpperCase());
    }
    return user1.getLastName().toUpperCase().compareTo(user2.getLastName().toUpperCase());
}