@java.lang.Override
public java.net.PasswordAuthentication getPasswordAuthentication() {
    if (((domain) != null) && (!(domain.isEmpty()))) {
        user = ((domain) + "\\") + (user);
    }
    if ((password) != null) {
        return new java.net.PasswordAuthentication(user, password.toCharArray());
    }
    return new java.net.PasswordAuthentication(user, null);
}