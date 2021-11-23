@java.lang.Override
public java.net.PasswordAuthentication getPasswordAuthentication() {
    if (((domain) != null) && (!(domain.isEmpty()))) {
        user = ((domain) + "\\") + (user);
    }
    return new java.net.PasswordAuthentication(user, password.toCharArray());
}