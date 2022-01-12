@java.lang.Override
protected void configure(org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    http.csrf().disable().authorizeRequests().antMatchers("/", "/personalArea", "/showAuthorList", "/showAllPictures", "/register", "/img/**", "/image/**", "/css/**", "/js/**", "/fonts/**").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().and().logout().permitAll();
}