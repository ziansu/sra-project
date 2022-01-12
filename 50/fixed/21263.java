@org.springframework.web.bind.annotation.RequestMapping(value = "/saveProductImg{productId}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String saveFiles(@org.springframework.web.bind.annotation.PathVariable
@org.springframework.format.annotation.NumberFormat
java.lang.Integer productId, @org.springframework.web.bind.annotation.ModelAttribute(value = "uploadForm")
com.eshop.main.FileUpload uploadForm) throws java.io.IOException, java.lang.IllegalStateException {
    picture.savePicture(uploadForm, productId);
    return "redirect:/admin/editProduct&" + productId;
}