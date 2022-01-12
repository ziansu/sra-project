@java.lang.Override
public void run() {
    if ((listener) != null) {
        listener.onPartialError(request.getCardType());
    }
}