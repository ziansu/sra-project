@java.lang.Override
@org.springframework.core.annotation.Order(value = org.springframework.boot.autoconfigure.security.SecurityProperties.ACCESS_OVERRIDE_ORDER)
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.POST, "/register", "/login").permitAll().antMatchers(HttpMethod.GET, "/user").permitAll().anyRequest().authenticated().and().addFilterAfter(new io.zipcoder.petfinder.CsrfHeaderFilter(), org.springframework.security.web.csrf.CsrfFilter.class).csrf().csrfTokenRepository(csrfTokenRepository()).disable();
}