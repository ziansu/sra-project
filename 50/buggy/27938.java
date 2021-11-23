@java.lang.Override
public boolean hasNext() {
    return (firstNotificationsIterator.hasNext()) || (secondNotificationsIterator.hasNext());
}