@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/editproduct/{id}")
public java.lang.String editProduct(@org.springframework.web.bind.annotation.PathVariable(value = "id")
int id, org.springframework.ui.Model model) {
    model.addAttribute("product", this.productService.getProductById(id));
    return "editproduct";
}