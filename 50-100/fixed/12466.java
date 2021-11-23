public com.mycompany.model.UserOTP saveUserQRCode(java.lang.String username, java.lang.String qrcode) {
    java.lang.System.out.println("=========+API============");
    com.mycompany.model.UserOTP userOTP = userOTPDao.getUserOTP(username);
    java.util.Date date = new java.util.Date();
    if (userOTP != null) {
        userOTP.setValidUser(true);
        userOTP.setQrcode(qrcode);
        userOTP.setModifiedTime(date);
        return userOTPDao.saveUserOTP(userOTP);
    }
    return userOTP;
}