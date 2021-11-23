@org.springframework.web.bind.annotation.RequestMapping(value = com.i3.ecom.utils.URLConstants.ADD_PRODUCT_URL, method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = { "multipart/form-data" })
@org.springframework.web.bind.annotation.ResponseBody
public com.i3.ecom.utils.ResponseMessage addProduct(@org.springframework.web.bind.annotation.RequestParam(value = "productJson")
java.lang.String productJson, @org.springframework.web.bind.annotation.RequestParam(value = "imageFile")
org.springframework.web.multipart.MultipartFile[] imageFile, org.springframework.ui.Model model) {
    com.i3.ecom.utils.ResponseMessage message = productService.addProduct(productJson, imageFile);
    return message;
}