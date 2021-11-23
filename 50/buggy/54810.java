@java.lang.Override
public void run() {
    myRemoveHandler.handle(index);
    if ((myValue) != null) {
        updateFromPretty(index);
    }else {
        sourceRemove(index);
    }
}