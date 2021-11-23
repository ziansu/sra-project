public static boolean checkKey(java.lang.String paraname, java.lang.String FKEY) {
    paraname = (null == paraname) ? "" : paraname;
    return com.fh.util.MD5.md5(((paraname + (com.fh.util.DateUtil.getDays())) + ",fh,")).equals(FKEY);
}