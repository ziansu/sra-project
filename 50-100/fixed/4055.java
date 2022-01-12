@org.springframework.beans.factory.annotation.Autowired
public void configureGlobal(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
    auth.jdbcAuthentication().usersByUsernameQuery("select email, password, active from users where email=?").authoritiesByUsernameQuery("select u.email, ur.roles from users u inner join user_roles ur on(u.id=ur.user_id) where u.email=?").dataSource(dataSource).passwordEncoder(bCryptPasswordEncoder);
}