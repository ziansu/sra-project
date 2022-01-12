@org.springframework.beans.factory.annotation.Autowired
public void configureGlobal(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    auth.inMemoryAuthentication().withUser("agent").password("agent123").roles("AGENT");
    auth.inMemoryAuthentication().withUser("admin").password("admin456").roles("ADMIN");
}