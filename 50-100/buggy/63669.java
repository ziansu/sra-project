@com.denimgroup.threadfix.webapp.controller.RequestMapping(value = "/{scanId}/delete", method = RequestMethod.POST)
@com.denimgroup.threadfix.webapp.controller.ResponseBody
public com.denimgroup.threadfix.remote.response.RestResponse<java.lang.String> deleteScan(@com.denimgroup.threadfix.webapp.controller.PathVariable(value = "orgId")
java.lang.Integer orgId, @com.denimgroup.threadfix.webapp.controller.PathVariable(value = "appId")
java.lang.Integer appId, @com.denimgroup.threadfix.webapp.controller.PathVariable(value = "scanId")
java.lang.Integer scanId) {
    if (!(com.denimgroup.threadfix.service.util.PermissionUtils.isAuthorized(Permission.CAN_UPLOAD_SCANS, orgId, appId))) {
        return com.denimgroup.threadfix.remote.response.RestResponse.failure("You do not have permission to delete scans.");
    }
    if (scanId != null) {
        com.denimgroup.threadfix.data.entities.Scan scan = scanService.loadScan(scanId);
        if (scan != null) {
            scanDeleteService.deleteScan(scan);
            vulnerabilityService.updateVulnerabilityReport(applicationService.loadApplication(appId));
        }
    }
    return com.denimgroup.threadfix.remote.response.RestResponse.success("Successfully deleted scan.");
}