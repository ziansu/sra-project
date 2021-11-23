@org.springframework.web.bind.annotation.RequestMapping(path = "/addRelationship", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.aming.web.qq.response.CommonResponse addRelationship(@org.springframework.web.bind.annotation.RequestBody
org.aming.web.qq.domain.User friend) {
    try {
        userService.addRelationship(friend);
        return org.aming.web.qq.response.CommonResponse.getSuccessCommonResponse(true);
    } catch (java.lang.Exception ex) {
        return org.aming.web.qq.response.CommonResponse.getErrorCommonResponse(ex);
    }
}