protected void authorizeDelfoi(fi.metatavu.edelphi.smvcj.controllers.RequestContext requestContext, fi.metatavu.edelphi.domainmodel.base.Delfoi delfoi, java.lang.String actionAccessName) {
    if (delfoi == null)
        throw new java.lang.IllegalStateException("PageController Delfoi action without Delfoi");
    
    if (!(fi.metatavu.edelphi.utils.ActionUtils.hasDelfoiAccess(requestContext, actionAccessName.toString()))) {
        throw new fi.metatavu.edelphi.smvcj.AccessDeniedException(requestContext.getRequest().getLocale());
    }
}