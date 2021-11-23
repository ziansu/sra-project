@java.lang.Override
public boolean next() throws java.sql.SQLException {
    throwIfTimedOutOrClosed();
    if ((cursor) != null) {
        if (!(super.next())) {
            throwIfTimedOut();
        }
        return true;
    }else {
        throwIfTimedOut();
        return false;
    }
}