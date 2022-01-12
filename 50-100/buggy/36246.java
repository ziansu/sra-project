public boolean validateAccount(@javax.annotation.Nullable
java.lang.String email, @javax.annotation.Nullable
java.lang.String pass) {
    boolean validated = false;
    java.util.List<edu.uw.citw.persistence.domain.auth.User> resultSet = userRepository.findByEmail(email);
    try {
        if ((resultSet.size()) <= 0) {
            edu.uw.citw.service.auth.AuthService.log.warn("User {} does not exist in database");
            return false;
        }
        validated = org.springframework.security.crypto.bcrypt.BCrypt.checkpw(pass, resultSet.get(0).getPassword());
    } catch (java.lang.NullPointerException e) {
        edu.uw.citw.service.auth.AuthService.log.error("Failed to retrieve user {}", email);
    }
    return validated;
}