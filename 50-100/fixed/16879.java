public static org.bugkillers.core.result.BaseResult<org.bugkillers.core.model.User> loginValidator(org.bugkillers.core.model.User user) {
    org.bugkillers.core.result.BaseResult<org.bugkillers.core.model.User> result = new org.bugkillers.core.result.BaseResult();
    if (((null == user) || (org.apache.commons.lang.StringUtils.isEmpty(user.getPassword()))) || ((org.apache.commons.lang.StringUtils.isEmpty(user.getUserName())) & (org.apache.commons.lang.StringUtils.isEmpty(user.getEmail())))) {
        return result.setMsg("必要请求参数不可为空").setCode(RetCode.PARAM_EMPTY);
    }
    return result.setRet(true);
}