private com.curus.httpio.response.ErrorData forgetPassword() {
    com.curus.model.database.Account account;
    if ((account = driver.accountDao.selectByPhone(request.getPhone())) == null) {
        errorData = new com.curus.httpio.response.ErrorData(com.curus.utils.constant.ErrorConst.IDX_USERNOTEXIST_ERROR);
        com.curus.services.account.passwd.AccountPasswdForgetService.logger.warn(com.curus.utils.LogUtils.Msg(errorData, request));
    }else {
        account.setPasswd(request.getPasswd());
        assert (driver.accountDao.updatePasswd(account)) == 1;
    }
    return errorData;
}