@org.springframework.web.bind.annotation.RequestMapping(value = "/boardId/{boardId}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<java.lang.Object> importOdmToOC(@org.springframework.web.bind.annotation.RequestBody
org.akaza.openclinica.controller.ODM odm, @org.springframework.web.bind.annotation.PathVariable(value = "boardId")
java.lang.String boardId) throws java.lang.Exception {
    try {
        odmImportServiceImpl.importOdm(odm, boardId);
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.OK);
    } catch (org.akaza.openclinica.service.CustomRuntimeException e) {
        return new org.springframework.http.ResponseEntity(e, org.springframework.http.HttpStatus.BAD_REQUEST);
    }
}