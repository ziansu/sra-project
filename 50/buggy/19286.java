@java.lang.Override
protected void configure(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(("select username,password,enabled " + ("from user " + "where username = ?"))).authoritiesByUsernameQuery("select username, 'ROLE_USER' from user where username=?").passwordEncoder(new org.springframework.security.crypto.password.StandardPasswordEncoder("corperwee"));
}