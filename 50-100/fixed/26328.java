@org.springframework.web.bind.annotation.RequestMapping(value = "/get_otp/{mobileNumber}", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<com.webtrucking.controller.domain.WalletOtpDTO> getOtp(@org.springframework.web.bind.annotation.PathVariable
java.lang.String mobileNumber) throws com.fasterxml.jackson.core.JsonProcessingException {
    com.webtrucking.controller.WalletControler.log.info("===== Start get otp for mobile number {}", mobileNumber);
    java.util.Map otp = tmnWalletClient.getOtp(mobileNumber);
    java.lang.String number = otp.get("mobile_number").toString();
    java.lang.String otpReference = otp.get("otp_reference").toString();
    com.webtrucking.controller.domain.WalletOtpDTO walletOtpDTO = new com.webtrucking.controller.domain.WalletOtpDTO(number, otpReference, null);
    com.webtrucking.controller.WalletControler.log.info("===== End get otp for mobile number {}", mobileNumber);
    return new org.springframework.http.ResponseEntity<com.webtrucking.controller.domain.WalletOtpDTO>(walletOtpDTO, org.springframework.http.HttpStatus.OK);
}