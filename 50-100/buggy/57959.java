@cheanxin.web.RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
public org.springframework.http.ResponseEntity<cheanxin.domain.Product> patch(@cheanxin.web.PathVariable(value = "id")
long id, @cheanxin.web.RequestBody
cheanxin.domain.Product unsavedProduct, @org.springframework.security.core.annotation.AuthenticationPrincipal
cheanxin.domain.User user) {
    org.springframework.util.Assert.isTrue((((unsavedProduct.getRemark()) != null) && (!(unsavedProduct.getRemark().trim().isEmpty()))), "Remark should not be empty.");
    cheanxin.domain.Product savedProduct = productService.findOne(id);
    org.springframework.util.Assert.notNull(savedProduct, "Product not found");
    return new org.springframework.http.ResponseEntity(productService.review(user, savedProduct, unsavedProduct), org.springframework.http.HttpStatus.OK);
}