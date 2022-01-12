public int random(java.lang.String username) throws exceptions_assignments.Exceptions_2.NotLoggedInException, exceptions_assignments.Exceptions_2.TooManyUsersLoggedInException {
    for (exceptions_assignments.Exceptions_2.User u : users) {
        if (u.getUsername().equals(username)) {
            if ((loggedin.size()) <= 2) {
                return ((int) ((java.lang.System.currentTimeMillis()) % 100));
            }else {
                throw new exceptions_assignments.Exceptions_2.TooManyUsersLoggedInException();
            }
        }
    }
    throw new exceptions_assignments.Exceptions_2.NotLoggedInException();
}