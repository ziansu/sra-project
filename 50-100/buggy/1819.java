private void addEntity(java.lang.String permission, int requestCode) {
    requestCode(requestCode);
    requestPermission(permission);
    com.joker.api.wrapper.AbstractWrapper.Key key = new com.joker.api.wrapper.AbstractWrapper.Key(getContext(), getRequestCode());
    com.joker.api.wrapper.AbstractWrapper.wrapperMap.put(key, new java.lang.ref.WeakReference<com.joker.api.wrapper.PermissionWrapper>(this));
}