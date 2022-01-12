public org.apache.struts.action.ActionForward viewDeclaration(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm actionForm, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    org.fenixedu.academic.domain.thesis.Thesis thesis = getThesis(request);
    if (thesis.isWaitingConfirmation()) {
        request.setAttribute("bean", new org.fenixedu.academic.ui.struts.action.student.thesis.DeclarationBean(thesis));
        return mapping.findForward("thesis-declaration");
    }else {
        return mapping.findForward("thesis-declaration-view");
    }
}