@com.phg.dhtmonitor.controller.RequestMapping(value = "/temperature/{temperature}/humidity/{humidity:.+}", method = RequestMethod.POST)
public org.springframework.http.ResponseEntity<?> dhtPost(@com.phg.dhtmonitor.controller.PathVariable
java.lang.String temperature, @com.phg.dhtmonitor.controller.PathVariable
java.lang.String humidity) {
    dhtService.SaveDHT(java.lang.Float.parseFloat(temperature), java.lang.Float.parseFloat(humidity));
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.CREATED);
}