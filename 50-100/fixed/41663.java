public com.revature.orderys.bean.User loginUser(java.lang.String email, java.lang.String password) throws com.revature.orderys.exceptions.InvalidCredentialsException {
    com.revature.orderys.bean.User u = UDao.getUserByEmail(email.trim());
    if ((u != null) && (org.springframework.security.crypto.bcrypt.BCrypt.checkpw(password, u.getPasswordHash()))) {
        return u;
    }else {
        throw new com.revature.orderys.exceptions.InvalidCredentialsException("User entered incorrect email or password.");
    }
}