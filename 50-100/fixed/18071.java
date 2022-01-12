@java.lang.Override
@org.springframework.core.annotation.Order(value = org.springframework.boot.autoconfigure.security.SecurityProperties.ACCESS_OVERRIDE_ORDER)
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.httpBasic().and().authorizeRequests().anyRequest().permitAll().and().addFilterAfter(new io.zipcoder.petfinder.CsrfHeaderFilter(), org.springframework.security.web.csrf.CsrfFilter.class).csrf().csrfTokenRepository(csrfTokenRepository()).disable();
}