private java.lang.String createMailcontent(ch.cyail.mail.EmailModel email) {
    java.lang.String content = (email.getTimeStamp()) + "\n";
    jTextFieldFrom.setText(email.getSender());
    jTextFieldTo.setText(email.getReceiver());
    jTextFieldCC.setText(email.getCc());
    content += ("bcc: " + (email.getBcc())) + "\n";
    jTextFieldSubject.setText(email.getSubject());
    content += (email.getText()) + "\n";
    return content;
}