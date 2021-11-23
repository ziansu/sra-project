public void hangup() {
    call.hangup();
    call.cancel();
    call.bye();
    call.listen();
    appController.stop();
}