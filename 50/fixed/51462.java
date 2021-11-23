public static com.iquanwai.platon.web.resolver.LoginUser defaultUser() {
    return new com.iquanwai.platon.web.resolver.LoginUser(com.iquanwai.platon.biz.util.ConfigUtils.getDefaultProfileId(), com.iquanwai.platon.biz.util.ConfigUtils.getDefaultOpenid(), "风之伤", com.iquanwai.platon.biz.po.common.Profile.DEFAULT_AVATAR, null, 5, null, true, true, 1, true, true, 1, true);
}