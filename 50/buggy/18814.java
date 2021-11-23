public static boolean isFake(int fileno) {
    return fileno >= (org.jruby.util.io.FilenoUtil.FIRST_FAKE_FD);
}