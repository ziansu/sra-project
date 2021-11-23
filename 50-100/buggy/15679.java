@com.xecoder.controller.business.RequestMapping(value = "jwtDelete", method = RequestMethod.DELETE)
@com.xecoder.controller.business.ResponseBody
public org.springframework.http.ResponseEntity<?> jwtDelete() {
    java.util.Map<java.lang.String, java.lang.Object> claims = ((java.util.Map<java.lang.String, java.lang.Object>) (request.getAttribute("claims")));
    request.setAttribute("claims", claims);
    java.lang.String id = java.lang.String.valueOf(claims.get("id"));
    if (id == null) {
        new org.springframework.http.ResponseEntity("id is null", org.springframework.http.HttpStatus.OK);
    }
    dao.delete(id);
    return new org.springframework.http.ResponseEntity("jwt delete ok", org.springframework.http.HttpStatus.OK);
}