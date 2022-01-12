@java.lang.Override
public void run() {
    myRemoveHandler.handle(index);
    sourceRemove(index);
    if ((myValue) != null) {
        updateFromPretty(index);
    }
}