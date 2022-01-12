@net.media.adserver.controller.RequestMapping(value = "/{page_name}/impression", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@net.media.adserver.controller.ResponseBody
public org.springframework.web.servlet.ModelAndView logSerpImpression(@net.media.adserver.controller.RequestParam
long adUnitId, @net.media.adserver.controller.RequestParam
long publisherId, @net.media.adserver.controller.RequestParam(required = false)
java.lang.String domain, @net.media.adserver.controller.RequestParam(required = false)
java.lang.String referrer, @net.media.adserver.controller.RequestParam(required = false)
java.lang.Integer actual, @net.media.adserver.controller.RequestParam
java.lang.String url, @net.media.adserver.controller.RequestParam
long requestId, @net.media.adserver.controller.RequestParam
java.lang.String callback, javax.servlet.http.HttpServletRequest request, @net.media.adserver.controller.PathVariable(value = "page_name")
java.lang.String page_name) {
    return net.media.adserver.controller.util.JsonPResponse.getJsonPResponse(true, loggingService.logSerpImpression(adUnitId, url, referrer, publisherId, net.media.adserver.common.RequestInfo.of(request), requestId), callback, null, requestId);
}