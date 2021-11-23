@com.oncheck.tipSystem.RequestMapping(value = "/tips", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<java.lang.Iterable<com.oncheck.tipSystem.Tip>> getTips() {
    java.lang.Iterable<com.oncheck.tipSystem.Tip> allTips = tipRepository.findAll();
    return new org.springframework.http.ResponseEntity(tipRepository.findAll(), org.springframework.http.HttpStatus.OK);
}