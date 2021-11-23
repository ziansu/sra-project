@com.alpha.web.RequestMapping(value = "/{productId}", method = RequestMethod.PUT)
public org.springframework.http.ResponseEntity<?> changeProduct(@com.alpha.web.PathVariable
java.lang.Long productId, @com.alpha.web.RequestParam(value = "count")
java.lang.Long count, @com.alpha.web.RequestParam(value = "price")
java.lang.Long price) {
    com.alpha.bean.Product product = productRepository.findOne(productId);
    if (product != null) {
        if (count != null)
            product.setCount(count);
        
        if (price != null)
            product.setPrice(price);
        
        return new org.springframework.http.ResponseEntity(productRepository.save(product), org.springframework.http.HttpStatus.OK);
    }else {
        return new org.springframework.http.ResponseEntity(null, org.springframework.http.HttpStatus.NOT_FOUND);
    }
}