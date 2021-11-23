@cz.mka.rest.RequestMapping(method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<java.util.Set<cz.mka.rest.model.AlcoholDTO>> findAllByDrinkerId(@cz.mka.rest.RequestParam
java.lang.Long drinkerId) {
    return new org.springframework.http.ResponseEntity(service.findAllByDrinkerId(drinkerId), org.springframework.http.HttpStatus.OK);
}