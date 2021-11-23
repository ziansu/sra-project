@org.springframework.web.bind.annotation.RequestMapping(path = "/api/recommend/{bankName}/{userId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<com.paypal.dealbridge.storage.domain.BriefDiscount> getBankDiscounts(@org.springframework.web.bind.annotation.PathVariable(value = "bankName")
java.lang.String bankName, @org.springframework.web.bind.annotation.PathVariable(value = "userId")
int userId, @org.springframework.web.bind.annotation.RequestParam(value = "latitude")
java.lang.Double latitude, @org.springframework.web.bind.annotation.RequestParam(value = "longitude")
java.lang.Double longitude, @org.springframework.web.bind.annotation.RequestParam(value = "startIndex", required = false)
java.lang.Integer start, @org.springframework.web.bind.annotation.RequestParam(value = "limitNumber", required = false)
java.lang.Integer number) throws com.paypal.dealbridge.service.recommend.RecommendQueryException, java.text.ParseException, org.json.JSONException {
    return recommendService.getDiscountsByBank(latitude, longitude, start, number, userId, bankMap.get(bankName));
}