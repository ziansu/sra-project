private void authSuccess(java.lang.String username) {
    isAuth = true;
    this.username = username;
    pulseListener = new client.transmission.PulseListener(this);
    pulseListenerThread = new java.lang.Thread(pulseListener);
    pulseListenerThread.start();
    pulseSender = new java.lang.Thread(new client.transmission.PulseSender(out, username));
    pulseSender.start();
    handleStream = new client.transmission.HandleStream(this, in);
    handleStreamThread = new java.lang.Thread(handleStream);
    handleStreamThread.start();
}