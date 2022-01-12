@io.swagger.annotations.ApiOperation(value = "returns the object, its ancestors and siblings")
@org.springframework.web.bind.annotation.RequestMapping(value = "/{collectionId}/{recordId}/ancestor-self-siblings.json", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.web.servlet.ModelAndView getAncestorSelfSiblings(@org.springframework.web.bind.annotation.PathVariable
java.lang.String collectionId, @org.springframework.web.bind.annotation.PathVariable
java.lang.String recordId, @org.springframework.web.bind.annotation.RequestParam(value = "profile", required = false, defaultValue = "")
java.lang.String profile, @org.springframework.web.bind.annotation.RequestParam(value = "wskey", required = true)
java.lang.String wskey, @org.springframework.web.bind.annotation.RequestParam(value = "callback", required = false)
java.lang.String callback, @org.springframework.web.bind.annotation.RequestParam(value = "hierarchytimeout", required = false)
int hierarchyTimeout, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttrs) {
    return hierarchyTemplate(RecordType.HIERARCHY_ANCESTOR_SELF_SIBLINGS, collectionId, recordId, profile, wskey, (-1), (-1), callback, request, response, redirectAttrs, hierarchyTimeout);
}