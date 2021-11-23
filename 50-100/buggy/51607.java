@java.lang.Override
public void truncate(long len) throws java.sql.SQLException {
    parse();
    isValid();
    if ((length) > len) {
        throw new java.sql.SQLException("Length more than what can be truncated");
    }else {
        len = length;
        if (len == 0) {
            value = new byte[]{  };
        }else {
            value = getSubString(1, ((int) (len))).getBytes();
        }
    }
}