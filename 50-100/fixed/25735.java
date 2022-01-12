@org.springframework.web.bind.annotation.RequestMapping(value = com.tutoring.util.Mappings.SIGN_UP, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public com.tutoring.util.ResponseVO createProfile(@org.springframework.web.bind.annotation.RequestBody
com.tutoring.model.Profile profile, javax.servlet.http.HttpServletResponse response) throws com.tutoring.exception.AppException {
    com.tutoring.util.ResponseVO responseVO;
    try {
        profile.setEmail(profile.getEmail().toLowerCase());
        responseVO = profileService.createProfile(profile);
        response.setStatus(responseVO.getStatus());
    } catch (java.lang.Exception e) {
        throw new com.tutoring.exception.AppException(e);
    }
    return responseVO;
}