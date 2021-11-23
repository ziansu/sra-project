@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<java.util.Set<cz.mka.rest.model.AlcoholDTO>> findAllByVolume(@org.springframework.web.bind.annotation.RequestParam
java.lang.Long drinkerId) {
    return new org.springframework.http.ResponseEntity(service.findAllByDrinkerId(drinkerId), org.springframework.http.HttpStatus.OK);
}