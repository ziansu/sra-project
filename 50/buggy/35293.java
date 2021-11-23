@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String newsIndex(javax.servlet.http.HttpServletRequest request) {
    return this.indexWithNoCache(request);
}