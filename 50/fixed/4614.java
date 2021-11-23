@java.lang.Override
public void configure(org.springframework.security.config.annotation.web.builders.WebSecurity web) throws java.lang.Exception {
    web.ignoring().antMatchers("/admin/resources/**", "/shopAdmin/resources/**", "/resources/**", "/favicon.ico", "/MP_verify_ExuzNoCNVM22thc+.txt**", "/MP_verify_uxa7tD8pJYJJCFjm.txt**", "/m/**");
}