@java.lang.Override
public java.net.PasswordAuthentication getPasswordAuthentication() {
    return new java.net.PasswordAuthentication(userName, password.toCharArray());
}