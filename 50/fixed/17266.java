@com.softserve.edu.controller.calibrator.RequestMapping(value = "new/count/calibrator", method = RequestMethod.GET)
public java.lang.Long getCountOfNewVerificationsByCalibratorId(@org.springframework.security.core.annotation.AuthenticationPrincipal
com.softserve.edu.service.SecurityUserDetailsService.CustomUserDetails user) {
    if (user != null) {
        return verificationService.findCountOfNewVerificationsByCalibratorId(user.getOrganizationId());
    }else {
        return null;
    }
}