@org.springframework.web.bind.annotation.RequestMapping(value = "/getExchangeRates.do")
public java.util.Map<java.lang.String, java.lang.Double> getExchangeRates(javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    java.lang.String userEmail = request.getRemoteUser();
    java.util.Map<java.lang.String, java.lang.Double> map = new java.util.HashMap<>();
    map.put("usd_rate", accountService.getUsdRate(userEmail));
    map.put("sar_rate", accountService.getSarRate(userEmail));
    return map;
}