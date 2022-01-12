@java.lang.SuppressWarnings(value = "unused")
@org.springframework.web.bind.annotation.RequestMapping(value = "/pay_info", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public com.alpha.common.base.HttpResult<?> getPayInfo(@org.springframework.web.bind.annotation.RequestParam
java.lang.String userName, @org.springframework.web.bind.annotation.RequestParam
java.lang.String token, @org.springframework.web.bind.annotation.RequestParam(value = "generateTime", required = true)
java.lang.String generateTime) {
    com.alpha.common.model.FinanceBean bean = rFinanceService.getPayInfo(userName, generateTime);
    java.util.Map<java.lang.String, java.lang.String> resMap = new java.util.HashMap<java.lang.String, java.lang.String>();
    java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
    if (bean != null) {
        resMap.put("amount", df.format(bean.getAmount()));
        return com.alpha.common.base.HttpResult.success(resMap);
    }
    return com.alpha.common.base.HttpResult.success(HttpCode.success_202);
}