@com.luxoft.wheretogo.controller.RequestMapping(value = "/groupImage", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<byte[]> getGroupImage(@com.luxoft.wheretogo.controller.RequestParam(value = "id")
java.lang.String param, javax.servlet.http.HttpServletRequest httpRequest) throws java.io.IOException {
    long id = com.luxoft.wheretogo.utils.ValidationUtils.validateRequestParam(param);
    if (id < 0)
        return new org.springframework.http.ResponseEntity<byte[]>(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR);
    
    com.luxoft.wheretogo.controller.Group gp = groupsService.findById(id);
    java.lang.String picture = gp.getPicture();
    org.springframework.http.ResponseEntity<byte[]> responseEntity = com.luxoft.wheretogo.utils.ImageUtils.giveMeImage(picture);
    return responseEntity;
}