public void exit() {
    com.google.common.base.Preconditions.checkState(((authScope.get()) != null), "No scoping block in progress");
    authScope.set(null);
}