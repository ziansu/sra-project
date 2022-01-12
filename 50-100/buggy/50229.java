@java.lang.Override
public java.lang.String generateChildWildcardCode(com.timelink.ejbs.WorkPackage wp) {
    java.lang.String code = wp.getCode();
    java.lang.StringBuilder sb = new java.lang.StringBuilder(wp.getCode());
    sb.setCharAt(code.indexOf('0'), '_');
    return sb.toString();
}