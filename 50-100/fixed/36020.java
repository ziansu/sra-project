@java.lang.Override
public void openIfClosed() throws java.lang.Exception {
    if (!(isOpen)) {
        if ((context) == null) {
            throw new java.lang.Exception("Context object is null");
        }
        db = context.openOrCreateDatabase(dbName, Context.MODE_PRIVATE, null);
        isOpen = true;
    }
}