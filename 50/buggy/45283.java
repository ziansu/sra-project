@java.lang.Override
public void startListening() {
    if (!(mSnapshots.isListening())) {
        mSnapshots.addChangeEventListener(this);
    }
}