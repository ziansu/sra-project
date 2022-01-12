@org.springframework.web.bind.annotation.RequestMapping(value = "/printOrder", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = (org.springframework.http.MediaType.APPLICATION_JSON_VALUE) + ";charset=UTF-8")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String printOrder(javax.servlet.http.HttpServletResponse resp, @org.springframework.web.bind.annotation.RequestParam
java.lang.String mac, @org.springframework.web.bind.annotation.RequestParam
java.lang.String shopid, @org.springframework.web.bind.annotation.RequestParam
java.lang.String posid, @org.springframework.web.bind.annotation.RequestParam
java.lang.String orderno, @org.springframework.web.bind.annotation.RequestParam
java.lang.String callback) throws java.io.IOException {
    java.lang.System.out.println("/printOrder: call order handler deal the request");
    net.sf.json.JSONObject jRet = orderService.dealReqPrintOrder(mac, shopid, orderno);
    java.lang.System.out.println("/printOrder: handler finished");
    return ((callback + "(") + (jRet.toString())) + ")";
}