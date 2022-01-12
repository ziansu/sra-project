@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/editproduct", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String editProductAndToIndex(@org.springframework.web.bind.annotation.ModelAttribute(value = "product")
Fiatskovich.viewmodelFiatskovich.ProductViewModel product) {
    productService.editProduct(product);
    return "redirect:/admin/index";
}