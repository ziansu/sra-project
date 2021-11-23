@java.lang.Override
public boolean next() throws java.sql.SQLException {
    throwIfTimedOutOrClosed();
    if ((cursor) != null) {
        boolean next;
        if (!(next = super.next())) {
            throwIfTimedOut();
        }
        return next;
    }else {
        throwIfTimedOut();
        return false;
    }
}