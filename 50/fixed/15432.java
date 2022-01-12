@org.springframework.web.bind.annotation.PostMapping(value = "/settingWebsite/products")
public java.lang.String addProduct(@org.springframework.web.bind.annotation.ModelAttribute(value = com.shop.svitnagorod.controller.AdminController.PRODUCTS)
com.shop.svitnagorod.DTO.ProductDTO productDTO) {
    productService.save(productDTO);
    return "redirect:/admin/settingWebsite/products";
}