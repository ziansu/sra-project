@java.lang.Override
public vng.paygate.domain.bo.BoBSOtp LoadOrderVerifyOTP(java.lang.String orderNo) {
    java.lang.StringBuilder responseCode = new java.lang.StringBuilder();
    vng.paygate.domain.bo.BoBSOtp boBSOtp = CallSPLoadOrderVerifyOTP(orderNo, responseCode);
    if ((boBSOtp == null) || (org.apache.commons.lang.StringUtils.isEmpty(responseCode.toString()))) {
        boBSOtp.setResponseCode(Constants.ERROR_5000);
    }else
        boBSOtp.setResponseCode(responseCode.toString());
    
    return boBSOtp;
}