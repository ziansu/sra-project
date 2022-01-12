@java.lang.Override
public java.lang.Boolean call(T o) {
    timber.log.Timber.e("Filter(): object type: %s typeClass is: %s", o.getClass(), type);
    if (o.getClass().equals(type)) {
        timber.log.Timber.e("Filer() return true");
        return true;
    }
    timber.log.Timber.e("Filer() return false");
    return false;
}