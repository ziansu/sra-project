@io.swagger.annotations.ApiOperation(value = "Drop Hive table", notes = "Privilege level: Consumer of this endpoint must be a member of specified organization")
@org.springframework.web.bind.annotation.RequestMapping(value = "/rest/tables", method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public void dropTable(@org.springframework.web.bind.annotation.RequestBody
org.trustedanalytics.datasetpublisher.boundary.Metadata metadata, @org.springframework.web.bind.annotation.RequestParam
java.util.Optional<java.lang.String> scope) {
    hiveService.dropTable(metadataMapper.apply(metadata), userIdentity);
}