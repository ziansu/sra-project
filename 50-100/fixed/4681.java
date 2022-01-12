@org.springframework.web.bind.annotation.RequestMapping(value = "/filter", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json")
public org.springframework.http.ResponseEntity<java.util.List<org.openbox.sf5.model.Transponders>> getTranspondersBySatelliteId(@org.springframework.web.bind.annotation.MatrixVariable(required = true, value = "satId")
long satId) {
    java.util.List<org.openbox.sf5.model.Transponders> transList = transpondersJsonizer.getTranspondersBySatelliteId(satId);
    if (transList.isEmpty()) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NO_CONTENT);
    }
    return new org.springframework.http.ResponseEntity(transList, org.springframework.http.HttpStatus.OK);
}