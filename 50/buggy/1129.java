@java.lang.Override
protected boolean validateRequest(org.springframework.extensions.webscripts.WebScriptRequest req, org.springframework.extensions.webscripts.Status status) {
    java.lang.String id = req.getServiceMatch().getTemplateVars().get(gov.nasa.jpl.view_repo.webscripts.REF_ID);
    return (checkRequestContent(req)) && (checkRequestVariable(id, gov.nasa.jpl.view_repo.webscripts.REF_ID));
}