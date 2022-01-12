@eu.cloudopting.web.rest.RequestMapping(value = "/application/{idApp}/{processId}/file/{idFile}", method = RequestMethod.DELETE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@eu.cloudopting.web.rest.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
@eu.cloudopting.web.rest.ResponseBody
public final eu.cloudopting.dto.ActivitiDTO deleteFile(javax.servlet.http.HttpServletRequest request, @eu.cloudopting.web.rest.PathVariable
java.lang.String idApp, @eu.cloudopting.web.rest.PathVariable
java.lang.String processId, @eu.cloudopting.web.rest.PathVariable
java.lang.String idFile) throws java.io.IOException {
    eu.cloudopting.dto.UploadDTO dto = new eu.cloudopting.dto.UploadDTO();
    dto.setFileId(idFile);
    dto.setIdApp(idApp);
    return getBpmnService().deleteFile(dto);
}