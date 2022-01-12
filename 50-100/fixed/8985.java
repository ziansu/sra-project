@com.dataloom.datastore.data.controllers.RequestMapping(path = { (("/" + (ENTITY_DATA)) + "/") + (SET_ID_PATH) }, method = RequestMethod.GET, produces = { org.springframework.http.MediaType.APPLICATION_JSON_VALUE , com.dataloom.datastore.constants.CustomMediaType.TEXT_CSV_VALUE })
public java.lang.Iterable<com.google.common.collect.SetMultimap<org.apache.olingo.commons.api.edm.FullQualifiedName, java.lang.Object>> loadEntitySetData(@com.dataloom.datastore.data.controllers.PathVariable(value = SET_ID)
java.util.UUID entitySetId, @com.dataloom.datastore.data.controllers.RequestParam(value = FILE_TYPE, required = false)
com.dataloom.datastore.data.controllers.FileType fileType, @com.dataloom.datastore.data.controllers.RequestParam(value = TOKEN, required = false)
java.lang.String token, javax.servlet.http.HttpServletResponse response) {
    com.dataloom.datastore.data.controllers.DataController.setContentDisposition(response, entitySetId.toString(), fileType);
    com.dataloom.datastore.data.controllers.DataController.setDownloadContentType(response, fileType);
    return loadEntitySetData(entitySetId, fileType, token);
}