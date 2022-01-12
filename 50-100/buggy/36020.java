@java.lang.Override
public void openIfClosed() {
    if (!(isOpen)) {
        if ((context) == null) {
            throw new java.lang.RuntimeException("Context object is null");
        }
        db = context.openOrCreateDatabase(dbName, Context.MODE_PRIVATE, null);
        isOpen = true;
    }
}