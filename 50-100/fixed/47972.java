@java.lang.Override
public boolean doCredentialsMatch(org.apache.shiro.authc.AuthenticationToken token, org.apache.shiro.authc.AuthenticationInfo info) {
    org.apache.shiro.authc.UsernamePasswordToken usernamePasswordToken = ((org.apache.shiro.authc.UsernamePasswordToken) (token));
    java.lang.String password = new java.lang.String(usernamePasswordToken.getPassword());
    java.lang.String hashedPassword = info.getCredentials().toString();
    return org.springframework.security.crypto.bcrypt.BCrypt.checkpw(password, hashedPassword);
}