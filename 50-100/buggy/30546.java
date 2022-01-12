@com.alpha.web.RequestMapping(value = "/{productId}/brand", method = RequestMethod.PUT)
public org.springframework.http.ResponseEntity<?> changeBrand(@com.alpha.web.PathVariable
java.lang.Long productId, @com.alpha.web.RequestParam
java.lang.Long brandId) {
    com.alpha.bean.Brand brand = brandRepository.findOne(brandId);
    com.alpha.bean.Product product = productRepository.findOne(productId);
    if ((product != null) && (brand != null)) {
        product.setBrand(brand);
        return new org.springframework.http.ResponseEntity<java.lang.Object>(productRepository.save(product), org.springframework.http.HttpStatus.OK);
    }else {
        return new org.springframework.http.ResponseEntity(null, org.springframework.http.HttpStatus.NOT_FOUND);
    }
}