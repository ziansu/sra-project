@eu.europeana.api2.v2.web.swagger.SwaggerIgnore
@eu.europeana.api2.v2.web.controller.RequestMapping(value = "/{collectionId}/{recordId}.srw", method = RequestMethod.GET, produces = org.springframework.http.MediaType.TEXT_XML_VALUE)
@eu.europeana.api2.v2.web.controller.ResponseBody
public eu.europeana.api2.model.xml.srw.SrwResponse recordSrw(@eu.europeana.api2.v2.web.controller.PathVariable
java.lang.String collectionId, @eu.europeana.api2.v2.web.controller.PathVariable
java.lang.String recordId, @eu.europeana.api2.v2.web.controller.RequestParam(value = "wskey", required = false)
java.lang.String wskey, org.springframework.web.context.request.WebRequest webRequest, javax.servlet.http.HttpServletRequest servletRequest, javax.servlet.http.HttpServletResponse response) throws eu.europeana.api2.ApiLimitException, eu.europeana.corelib.web.exception.EuropeanaException {
    eu.europeana.api2.v2.web.controller.ObjectController.RequestData data = new eu.europeana.api2.v2.web.controller.ObjectController.RequestData(collectionId, recordId, wskey, null, null, null, webRequest, servletRequest);
    java.lang.Object out = handleRecordRequest(RecordType.OBJECT_SRW, data, response);
    if (out instanceof eu.europeana.api2.model.xml.srw.SrwResponse) {
        return ((eu.europeana.api2.model.xml.srw.SrwResponse) (out));
    }
    return null;
}