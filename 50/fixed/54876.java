@java.lang.Override
public void thumbsDown() {
    validateRadioState();
    pandoraRadio.rate(song, false);
    next();
}