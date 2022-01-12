public int random(java.lang.String username) throws exceptions_assignments.Exceptions_2.NotLoggedInException, exceptions_assignments.Exceptions_2.TooManyUsersLoggedInException {
    if ((loggedin.size()) > 2)
        throw new exceptions_assignments.Exceptions_2.TooManyUsersLoggedInException();
    
    for (exceptions_assignments.Exceptions_2.User u : loggedin) {
        if (u.getUsername().equals(username)) {
            return ((int) ((java.lang.System.currentTimeMillis()) % 100));
        }
    }
    throw new exceptions_assignments.Exceptions_2.NotLoggedInException();
}