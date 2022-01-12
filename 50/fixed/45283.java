@java.lang.Override
public void startListening() {
    if (!(mSnapshots.isListening(this))) {
        mSnapshots.addChangeEventListener(this);
    }
}