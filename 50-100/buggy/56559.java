@org.springframework.web.bind.annotation.RequestMapping(value = "promotions/sms", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<?> getPromotionCode(@org.springframework.web.bind.annotation.RequestParam(value = "type")
java.lang.String type, @org.springframework.web.bind.annotation.RequestParam(value = "salonId")
java.lang.String salonId, @org.springframework.web.bind.annotation.RequestParam(value = "customerId")
java.lang.String customerId) throws java.lang.Exception {
    pitayaa.nail.domain.promotion.Promotion promotionDeliver = promotionService.getPromotionCodeRandom(salonId, type, customerId);
    org.springframework.hateoas.Resource<pitayaa.nail.domain.promotion.Promotion> resource = new org.springframework.hateoas.Resource<pitayaa.nail.domain.promotion.Promotion>(promotionDeliver);
    return new org.springframework.http.ResponseEntity(resource, org.springframework.http.HttpStatus.OK);
}