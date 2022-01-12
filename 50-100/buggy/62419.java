private void validateUserEmail(has.Guest.Guest guest) throws java.lang.Exception {
    has.User.User dbUser2 = repoUser.findByEmail(guest.getUser().getEmail());
    if ((dbUser2 != null) && ((dbUser2.getId()) != (guest.getUser().getId()))) {
        throw new has.Exceptions.EmailAlreadyExists(guest.getUser().getEmail());
    }
}