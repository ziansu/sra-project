@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteProductDetails")
@org.springframework.web.bind.annotation.ResponseBody
public long deleteProductDetails(@org.springframework.web.bind.annotation.RequestBody
com.webapp.project.modules.product.model.ProductDetails[] ProductDetails) {
    productService.deleteProductDetails(ProductDetails);
    return 0;
}