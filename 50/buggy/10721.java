@java.lang.Override
public void init(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    auth.jdbcAuthentication().dataSource(this.dataSource);
    auth.userDetailsService(userDetailsService);
}