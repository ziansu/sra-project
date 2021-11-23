@org.mifos.beyonicIntegration.service.BeyonicService.RequestMapping(value = "/collections", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<java.lang.String> receiveCollection(@org.mifos.beyonicIntegration.service.BeyonicService.RequestBody
org.mifos.beyonicIntegration.service.BeyonicService.domain.CollectionNotification notif) {
    java.lang.System.out.println(notif.getData().toString());
    try {
        receptionStatus = sendCollectionToGateway(notif, mfiProperties);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return new org.springframework.http.ResponseEntity("Collection received", org.springframework.http.HttpStatus.OK);
}