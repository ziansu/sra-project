@java.lang.Override
public java.lang.String generateChildWildcardCode(com.timelink.ejbs.WorkPackage wp) {
    java.lang.String code = wp.getCode();
    java.lang.StringBuilder sb = new java.lang.StringBuilder(wp.getCode());
    int index = code.indexOf('0');
    if (index == (-1)) {
        return null;
    }
    sb.setCharAt(index, '_');
    return sb.toString();
}