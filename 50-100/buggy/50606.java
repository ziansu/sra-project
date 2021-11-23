@io.swagger.annotations.ApiOperation(value = "List User profiles")
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<java.util.List<com.strateratech.dhs.peerrate.rest.contract.UserProfile>> listUserProfiles() {
    org.springframework.http.HttpStatus status = org.springframework.http.HttpStatus.OK;
    org.springframework.http.HttpHeaders headers = com.strateratech.dhs.peerrate.web.utils.RestUtils.buildRestHttpHeaders();
    java.util.List<com.strateratech.dhs.peerrate.rest.contract.UserProfile> list = userProfileService.listUserProfiles();
    org.springframework.http.ResponseEntity<java.util.List<com.strateratech.dhs.peerrate.rest.contract.UserProfile>> resp = new org.springframework.http.ResponseEntity(headers, org.springframework.http.HttpStatus.NO_CONTENT);
    if ((list.size()) > 0) {
        resp = new org.springframework.http.ResponseEntity(list, headers, org.springframework.http.HttpStatus.NO_CONTENT);
    }
    return resp;
}