public void closeTransport() {
    try {
        if ((transport.get()) != null) {
            transport.get().close();
            transport.set(null);
        }
    } catch (javax.mail.MessagingException e) {
    }
}