@org.springframework.web.bind.annotation.RequestMapping(path = { (("/" + (ENTITY_DATA)) + "/") + (SET_ID_PATH) }, method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = { org.springframework.http.MediaType.APPLICATION_JSON_VALUE , com.dataloom.datastore.constants.CustomMediaType.TEXT_CSV_VALUE })
public java.lang.Iterable<com.google.common.collect.SetMultimap<org.apache.olingo.commons.api.edm.FullQualifiedName, java.lang.Object>> loadEntitySetData(@org.springframework.web.bind.annotation.PathVariable(value = SET_ID)
java.util.UUID entitySetId, @org.springframework.web.bind.annotation.RequestBody(required = false)
com.dataloom.data.requests.EntitySetSelection req, @org.springframework.web.bind.annotation.RequestParam(value = FILE_TYPE, required = false)
com.dataloom.datastore.data.controllers.FileType fileType, javax.servlet.http.HttpServletResponse response) {
    com.dataloom.datastore.data.controllers.DataController.setContentDisposition(response, entitySetId.toString(), fileType);
    com.dataloom.datastore.data.controllers.DataController.setDownloadContentType(response, fileType);
    return loadEntitySetData(entitySetId, req, fileType);
}