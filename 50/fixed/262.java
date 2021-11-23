@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, params = "range=individual", produces = "application/json")
public java.util.List<com.revify.dto.ReviewDTO> getIndividualReview(@org.springframework.web.bind.annotation.RequestParam(required = true, value = "productID")
java.lang.String productID) {
    return reviewService.getIndividualReview(productID);
}