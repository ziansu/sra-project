public void createUser(hw.oauth.messages.user.CreateUserMessage message) {
    java.time.Instant passwordExpiresAt = mapLocalDate(java.time.LocalDate.now());
    try {
        new hw.oauth2.services.admin.InsertUser(message, jdbcTemplate).insertUser(passwordExpiresAt).insertAuthorities().insertStatusLogin();
    } catch (org.springframework.dao.DuplicateKeyException ex) {
        throw new hw.oauth2.services.admin.UserAlreadyExistsException((("User " + (message.getUserId())) + " already exists"), ex);
    }
}