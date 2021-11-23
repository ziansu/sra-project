@com.luxoft.wheretogo.controller.RequestMapping(value = "/userImage", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<byte[]> getUserImage(javax.servlet.http.HttpServletRequest httpRequest) throws java.io.IOException {
    com.luxoft.wheretogo.controller.User user = ((com.luxoft.wheretogo.controller.User) (httpRequest.getSession().getAttribute("user")));
    if (user != null) {
        java.lang.String picture = user.getPicture();
        return com.luxoft.wheretogo.utils.ImageUtils.giveMeImage(picture);
    }else
        return new org.springframework.http.ResponseEntity<byte[]>(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR);
    
}