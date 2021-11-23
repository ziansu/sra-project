@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/ajaxChooseProducts")
public java.lang.String ajaxChooseProducts(com.core.dao.Page<com.store.domain.product.ProductDO> page, java.lang.String condition, java.lang.String search, java.lang.Integer type, org.springframework.ui.Model model) throws com.core.web.freemarker.FreemarkerParseException {
    listChooseModel(page, condition, search, type, model);
    return jsonResponseView("/store/product/choose/products", model);
}