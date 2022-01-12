private boolean check() {
    java.lang.String caiji = caijipinlv.getRightRealString();
    boolean check = false;
    if (com.blankj.utilcode.utils.RegexUtils.isMatch(caiji, ConstUtils.REGEX_POSITIVE_INTEGER)) {
        check = true;
    }else {
        return false;
    }
    java.lang.String dabao = dabaopinlv.getRightRealString();
    if (com.blankj.utilcode.utils.RegexUtils.isMatch(dabao, ConstUtils.REGEX_POSITIVE_INTEGER)) {
        check = true;
    }else {
        return false;
    }
    return check;
}