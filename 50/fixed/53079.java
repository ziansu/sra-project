private boolean isProtectAvailable(android.content.Context context) {
    return (protectmanager.getCount()) < ((scm.get(context)) - 1);
}