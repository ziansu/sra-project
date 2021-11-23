@java.lang.Override
public javax.mail.PasswordAuthentication getPasswordAuthentication() {
    if (((this.username) != "") && ((this.password) != "")) {
        return new javax.mail.PasswordAuthentication(username, password);
    }else {
        return super.getPasswordAuthentication();
    }
}