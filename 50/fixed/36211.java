protected boolean isTombstoned(database.IControllable controller, java.lang.String suffix) throws java.lang.InterruptedException {
    boolean temp = controller.exists(((pathPrefixTombstoned) + suffix));
    return temp;
}