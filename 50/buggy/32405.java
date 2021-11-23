@org.springframework.web.bind.annotation.RequestMapping(value = "/detail/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView detailProduct(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    com.rizomm.misys.model.Product product = _productRepository.findOne(id);
    return new org.springframework.web.servlet.ModelAndView("product/detail", "product", product);
}