public void receive(actors.EchoText message) {
    synchronized(mail_box) {
        mail_box.add(message);
    }
    process_next_message();
}