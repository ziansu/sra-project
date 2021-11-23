@org.springframework.web.bind.annotation.RequestMapping(value = "/getMenuAndroid", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getMenuAndroid(@org.springframework.web.bind.annotation.RequestParam(value = MODEL_CUSTOMER_ORDER)
java.lang.String customerOrder, org.springframework.ui.ModelMap model) {
    com.rns.tiffeat.web.bo.domain.CustomerOrder order = new com.google.gson.Gson().fromJson(customerOrder, com.rns.tiffeat.web.bo.domain.CustomerOrder.class);
    return new com.google.gson.Gson().toJson(customerBo.getDailyContentForMeal(order.getMeal(), order.getMealType()));
}