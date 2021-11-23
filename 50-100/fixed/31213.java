@org.springframework.transaction.annotation.Transactional
@org.springframework.web.bind.annotation.RequestMapping(value = "/fetchGroup", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.Map<java.lang.String, java.lang.Object> fetchEventGroupFromDblp(@org.springframework.web.bind.annotation.RequestParam(value = "id", required = false)
final java.lang.String id, @org.springframework.web.bind.annotation.RequestParam(value = "pid", required = false)
final java.lang.String pid, @org.springframework.web.bind.annotation.RequestParam(value = "force", required = false)
final java.lang.String force, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, java.lang.InterruptedException, java.text.ParseException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException, org.apache.http.ParseException, org.apache.oltu.oauth2.common.exception.OAuthProblemException, org.apache.oltu.oauth2.common.exception.OAuthSystemException {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<de.rwth.i9.palm.model.EventGroup> sessionEventGroups = null;
    return academicEventFeature.getEventMining().fetchEventGroupData(id, pid, sessionEventGroups);
}