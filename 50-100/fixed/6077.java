@java.lang.Override
public javax.mail.PasswordAuthentication getPasswordAuthentication() {
    if ((!(this.username.isEmpty())) && (!(this.password.isEmpty()))) {
        return new javax.mail.PasswordAuthentication(username, password);
    }else {
        return super.getPasswordAuthentication();
    }
}