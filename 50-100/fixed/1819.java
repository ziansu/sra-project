private void addEntity(java.lang.String permission, int requestCode, boolean add) {
    requestCode(requestCode);
    requestPermission(permission);
    if (add) {
        com.joker.api.wrapper.AbstractWrapper.Key key = new com.joker.api.wrapper.AbstractWrapper.Key(getContext(), getRequestCode());
        com.joker.api.wrapper.AbstractWrapper.wrapperMap.put(key, new java.lang.ref.WeakReference<com.joker.api.wrapper.PermissionWrapper>(this));
    }
}