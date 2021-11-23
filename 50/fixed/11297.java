public static void copyUserProperties(com.dajia.vo.LoginUserVO src, com.dajia.domain.User target) {
    target.email = src.email;
    target.mobile = src.mobile;
    if (null != (src.userName)) {
        target.userName = src.userName;
    }
    target.password = src.password;
}