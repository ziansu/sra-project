private void saveUserMessage(com.ebao.cas.credential.JdbcUsernamePasswordCredential credential) {
    jdbcTemplate.update(UpdatePwdsql, new java.lang.Object[]{ credential.getNewpassword() , new java.util.Date() , 1 , credential.getUsername() });
}