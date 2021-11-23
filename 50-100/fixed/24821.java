public user.User login() throws user.loginException {
    if (user.User.userExist(username)) {
        user.User u = user.User.getUserByUsername(username);
        try {
            password = user.PasswordHash.hash(password);
        } catch (java.security.NoSuchAlgorithmException e) {
            return null;
        }
        if (u.getPassword().equals(password)) {
            return u;
        }else {
            throw new user.loginException("Password Incorrect! Please check.");
        }
    }else {
        throw new user.loginException("Username does not exist! Please check.");
    }
}