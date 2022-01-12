@org.springframework.web.bind.annotation.RequestMapping(value = "/filter", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = javax.ws.rs.core.MediaType.APPLICATION_XML)
public org.springframework.http.ResponseEntity<org.openbox.sf5.model.listwrappers.GenericXMLListWrapper<org.openbox.sf5.model.Transponders>> getTranspondersBySatelliteIdXML(@org.springframework.web.bind.annotation.MatrixVariable(required = true, value = "satId")
long satId) {
    java.util.List<org.openbox.sf5.model.Transponders> transList = transpondersJsonizer.getTranspondersBySatelliteId(satId);
    if (transList.isEmpty()) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NO_CONTENT);
    }
    return org.openbox.sf5.common.JsonObjectFiller.returnGenericWrapperResponseBySatList(transList, org.openbox.sf5.model.Transponders.class);
}