@org.springframework.web.bind.annotation.RequestMapping(value = "/save", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String saveProduct(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute
dto.ProductDTO productDTO, org.springframework.validation.BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
        return "productForm";
    }
    productService.saveOrUpdate(productDTO);
    return "redirect:/home";
}