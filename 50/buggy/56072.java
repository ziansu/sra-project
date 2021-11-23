@org.springframework.web.bind.annotation.RequestMapping(value = "/getAllEmployees", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getAllProducts(org.springframework.ui.Model model) {
    java.util.List<com.newt.entity.Product> productList = productService.getAllProducts();
    model.addAttribute("product", new com.newt.entity.Product());
    model.addAttribute("productList", productList);
    return "productList";
}