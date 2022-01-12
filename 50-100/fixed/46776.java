private java.lang.String getVerificationCode(java.lang.String message) {
    java.lang.String code = null;
    int index = message.indexOf(org.apache.cordova.OTPAutoVerification.OTPAutoVerification.OTP_DELIMITER);
    if (index != (-1)) {
        int start = (index + (org.apache.cordova.OTPAutoVerification.OTPAutoVerification.OTP_DELIMITER.length())) + 1;
        int length = org.apache.cordova.OTPAutoVerification.OTPAutoVerification.OTP_LENGTH;
        code = message.substring(start, (start + length));
        return code;
    }
    return code;
}