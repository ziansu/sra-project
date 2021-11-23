@java.lang.Override
public void run() {
    if (mReceivers.contains(receiver)) {
        dispatch(receiver, sticky);
    }
}