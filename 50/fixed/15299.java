@java.lang.Override
public void start() {
    if ((initialized) && ((sender) != null)) {
        sender.startSending();
    }
}