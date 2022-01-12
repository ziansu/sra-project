@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.WebSecurity web) throws java.lang.Exception {
    web.ignoring().antMatchers("/rest/**/*");
    web.ignoring().antMatchers("/auth/login");
    web.ignoring().antMatchers("/favicon.ico");
    web.ignoring().antMatchers("/**/*.html");
    web.ignoring().antMatchers("/**/*.css");
    web.ignoring().antMatchers("/**/*.js");
    web.ignoring().antMatchers("/**/*.png");
}