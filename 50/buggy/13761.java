@java.lang.Override
public void failure() {
    currentTransaction.get().failure();
}