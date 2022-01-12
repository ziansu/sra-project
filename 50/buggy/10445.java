private static java.io.DataOutputStream GetOutputStream() {
    if (null == (com.plugish.woominecraft.Connection.outputStream)) {
        com.plugish.woominecraft.Connection.setOutputStream();
    }
    return com.plugish.woominecraft.Connection.outputStream;
}