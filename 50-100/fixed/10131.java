@org.springframework.web.bind.annotation.RequestMapping(value = "/assemblies/{assemblyId}/export", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public com.oneops.transistor.export.domain.DesignExportSimple exportDesign(@org.springframework.web.bind.annotation.PathVariable
long assemblyId, @org.springframework.web.bind.annotation.RequestHeader(value = "X-Cms-User", required = false)
java.lang.String userId, @org.springframework.web.bind.annotation.RequestHeader(value = "X-Cms-Scope", required = false)
java.lang.String scope) {
    if (userId == null)
        userId = "oneops-system";
    
    try {
        return dManager.exportDesign(assemblyId);
    } catch (com.oneops.cms.exceptions.CmsBaseException te) {
        com.oneops.transistor.ws.rest.TransistorRestController.logger.error(te);
        te.printStackTrace();
        throw te;
    }
}