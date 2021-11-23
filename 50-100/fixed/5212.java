@java.lang.Override
public org.springframework.security.core.Authentication attemptAuthentication(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws org.springframework.security.core.AuthenticationException {
    org.springframework.security.core.Authentication authentication = super.attemptAuthentication(request, response);
    java.util.Date now = new java.util.Date();
    com.example.model.UsersModel user = ((com.example.model.UsersModel) (authentication.getPrincipal()));
    com.example.model.UsersModel usersModel = userRepository.findOne(user.getName());
    usersModel.setLoginDate(now);
    userRepository.save(usersModel);
    user.setLoginDate(now);
    return authentication;
}