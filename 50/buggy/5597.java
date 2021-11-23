public void insert(java.lang.String aUsername, java.lang.String aPassword) {
    org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder lEncoder = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
    java.lang.String lPassword = lEncoder.encode(aPassword);
    jdbcTemplate.update("INSERT INTO paste_users(username, password) VALUES(?, ?)", aUsername, lPassword, 0);
}