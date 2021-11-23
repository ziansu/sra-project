protected boolean isTombstoned(database.IControllable controller, java.lang.String suffix) throws java.lang.InterruptedException {
    return controller.exists(((pathPrefixTombstoned) + suffix));
}