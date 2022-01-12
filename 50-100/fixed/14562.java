@org.springframework.web.bind.annotation.RequestMapping(produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.HttpStatus error(org.apache.catalina.servlet4preview.http.HttpServletRequest request) {
    java.util.Map<java.lang.String, java.lang.Object> errorAttributes = this.errorAttributes.getErrorAttributes(new org.springframework.web.context.request.ServletRequestAttributes(request), false);
    org.springframework.http.HttpStatus httpStatus = org.springframework.http.HttpStatus.valueOf(((java.lang.Integer) (errorAttributes.get(com.omnia.cheetah.controller.ErrorsController.STATUS_KEY))));
    return httpStatus;
}