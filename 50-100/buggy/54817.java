@org.springframework.web.bind.annotation.RequestMapping(value = "/getExchangeRates.do")
public java.util.Map<java.lang.String, java.lang.Double> getExchangeRates(javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    java.lang.String userEmail = request.getRemoteUser();
    double usdRate = accountService.getUsdRate(userEmail);
    double sarRate = accountService.getSarRate(userEmail);
    java.util.Map<java.lang.String, java.lang.Double> map = new java.util.HashMap<>();
    map.put("usd_rate", usdRate);
    map.put("sar_rate", sarRate);
    return map;
}