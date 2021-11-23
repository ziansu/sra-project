@org.springframework.web.bind.annotation.RequestMapping(value = "/libraries", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = { org.springframework.http.MediaType.APPLICATION_JSON_VALUE })
public org.springframework.http.ResponseEntity<java.util.List<org.lenndi.umtapo.dto.LibraryDto>> getLibraries(@javax.websocket.server.PathParam(value = "external")
java.lang.Boolean external) {
    java.util.List<org.lenndi.umtapo.dto.LibraryDto> librariesDto;
    if (external) {
        librariesDto = this.libraryService.findAllExternal();
    }else {
        librariesDto = this.libraryService.findAllPartner();
    }
    if (librariesDto.isEmpty()) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NO_CONTENT);
    }
    return new org.springframework.http.ResponseEntity(librariesDto, org.springframework.http.HttpStatus.OK);
}