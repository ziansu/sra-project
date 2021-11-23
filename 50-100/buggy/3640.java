@org.springframework.web.bind.annotation.RequestMapping(value = "/{code}", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public org.springframework.http.ResponseEntity<java.lang.Void> updateProduct(@org.springframework.web.bind.annotation.PathVariable(value = "code")
long code, @org.springframework.web.bind.annotation.RequestBody
com.IJM.dto.ProductImageDto productImageDto) {
    java.lang.System.out.println(("Updating ProductImageDto " + code));
    org.springframework.http.HttpStatus status;
    try {
        productImageService.updateProductImage(productImageDto, code);
        status = org.springframework.http.HttpStatus.OK;
    } catch (java.lang.Exception e) {
        status = org.springframework.http.HttpStatus.CONFLICT;
    }
    return new org.springframework.http.ResponseEntity<java.lang.Void>(status);
}