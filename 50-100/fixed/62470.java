@org.springframework.web.bind.annotation.RequestMapping
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> error(javax.servlet.http.HttpServletRequest request) {
    java.util.Map<java.lang.String, java.lang.Object> body = getErrorAttributes(request, isIncludeStackTrace(request, MediaType.ALL));
    org.springframework.http.HttpStatus status = getStatus(request);
    return new org.springframework.http.ResponseEntity(body, status);
}