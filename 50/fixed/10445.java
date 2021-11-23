private java.io.DataOutputStream GetOutputStream() {
    if (null == (com.plugish.woominecraft.Connection.outputStream)) {
        setOutputStream();
    }
    return com.plugish.woominecraft.Connection.outputStream;
}