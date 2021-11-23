public void actionPerformed(java.awt.event.ActionEvent e) {
    int num = (i) + 1;
    message[i] = (("Message " + num) + ": ") + (text.getText());
    log.setText(java.lang.String.join("\n", message));
    (i)++;
}