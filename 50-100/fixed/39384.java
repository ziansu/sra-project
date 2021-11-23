@org.springframework.web.bind.annotation.RequestMapping(value = "/add")
@org.springframework.web.bind.annotation.ResponseBody
public com.heitian.ssm.bo.Result addShopAd(javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.RequestParam
java.lang.String photoUrl, @org.springframework.web.bind.annotation.RequestParam
java.lang.Double price) {
    java.lang.String auth = request.getHeader("Authorization");
    if (auth == null) {
        result.setMessage("haven't log in");
        result.setStatus(0);
        return result;
    }
    java.lang.String id = auth.substring(((auth.indexOf("Id=")) + 3), auth.indexOf(";"));
    return shopAdService.addShopAd(java.lang.Long.valueOf(id), photoUrl, price);
}