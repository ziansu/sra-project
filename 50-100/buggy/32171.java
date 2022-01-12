public org.apache.struts.action.ActionForward prepareCreatePhdGratuityExemptionForGratuity(org.apache.struts.action.ActionMapping mapping, org.apache.struts.action.ActionForm actionForm, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    org.fenixedu.academic.ui.struts.action.phd.PhdEventExemptionBean phdEventExemptionBean = new org.fenixedu.academic.ui.struts.action.phd.PhdEventExemptionBean(((org.fenixedu.academic.domain.phd.debts.PhdEvent) (getEvent(request))));
    phdEventExemptionBean.setJustificationType(PhdEventExemptionJustificationType.PHD_GRATUITY_FCT_SCHOLARSHIP_EXEMPTION);
    phdEventExemptionBean.setProviders(new java.util.ArrayList<org.fenixedu.academic.domain.organizationalStructure.Party>(org.fenixedu.bennu.core.domain.Bennu.getInstance().getExternalScholarshipProviderSet()));
    request.setAttribute("exemptionBean", phdEventExemptionBean);
    return mapping.findForward("createFCTExemption");
}