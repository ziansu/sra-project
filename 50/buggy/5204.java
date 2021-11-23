@java.lang.Override
public boolean isDone() {
    if ((index) > (this.transactions.size())) {
        return false;
    }
    return true;
}