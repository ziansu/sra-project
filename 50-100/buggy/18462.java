@org.springframework.web.bind.annotation.RequestMapping(value = (com.meta64.mobile.AppController.API_PATH) + "/export", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@com.meta64.mobile.aspect.OakSession
@org.springframework.web.bind.annotation.ResponseBody
public com.meta64.mobile.response.ExportResponse exportToXml(@org.springframework.web.bind.annotation.RequestBody
com.meta64.mobile.request.ExportRequest req) {
    com.meta64.mobile.AppController.logRequest("exportToXml", req);
    com.meta64.mobile.response.ExportResponse res = new com.meta64.mobile.response.ExportResponse();
    checkHttpSession();
    if ("xml".equalsIgnoreCase(req.getExportExt())) {
        exportXmlService.export(null, req, res);
    }
    if ("zip".equalsIgnoreCase(req.getExportExt())) {
        exportZipService.export(null, req, res);
    }else {
        throw com.meta64.mobile.util.ExUtil.newEx("Unsupported file extension.");
    }
    return res;
}