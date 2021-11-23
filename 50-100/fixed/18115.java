private boolean check() {
    java.lang.String caiji = caijipinlv.getRightRealString();
    boolean check = false;
    if (com.blankj.utilcode.utils.RegexUtils.isMatch(ConstUtils.REGEX_POSITIVE_INTEGER, caiji)) {
        check = true;
    }else {
        return false;
    }
    java.lang.String dabao = dabaopinlv.getRightRealString();
    if (com.blankj.utilcode.utils.RegexUtils.isMatch(ConstUtils.REGEX_POSITIVE_INTEGER, dabao)) {
        check = true;
    }else {
        return false;
    }
    return check;
}