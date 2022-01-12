public static boolean isFake(int fileno) {
    return (fileno < 0) || (fileno >= (org.jruby.util.io.FilenoUtil.FIRST_FAKE_FD));
}