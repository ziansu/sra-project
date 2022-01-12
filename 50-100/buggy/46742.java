@org.springframework.web.bind.annotation.GetMapping(value = "/settingWebsite/products")
public java.lang.String managementProduct(org.springframework.ui.Model model) {
    java.lang.System.out.println("Products are doing ...............");
    model.addAttribute(com.shop.svitnagorod.controller.AdminController.PRODUCTS, productService.findAllProducts());
    model.addAttribute(com.shop.svitnagorod.controller.AdminController.PRODUCT, new com.shop.svitnagorod.DTO.ProductDTO());
    model.addAttribute(com.shop.svitnagorod.controller.AdminController.CATEGORIES, categoryService.findAllCategory());
    return "managementProducts";
}