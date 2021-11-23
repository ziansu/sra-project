@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public java.lang.String index(javax.servlet.http.HttpServletRequest request) {
    com.newerth.core.Utils.logRequest(request, this.getClass());
    test();
    return "XR Server instagib API";
}