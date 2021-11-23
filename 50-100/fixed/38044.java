@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/toChoose")
public java.lang.String toChoose(java.lang.String condition, java.lang.Integer type, org.springframework.ui.Model model) throws com.core.web.freemarker.FreemarkerParseException {
    listChooseModel(new com.core.dao.Page<com.store.domain.product.ProductDO>(1, "chooseProductPage"), condition, null, type, model);
    model.addAttribute("classifies", classifyService.listByIndexAsc());
    return jsonResponseView("/store/product/choose/listForm", model);
}