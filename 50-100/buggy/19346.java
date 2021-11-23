@org.springframework.web.bind.annotation.RequestMapping(value = "/openMarcRecord")
public java.lang.String openMarcRecord(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute(value = "bibId")
java.lang.Integer bibId, org.springframework.ui.Model model) {
    org.apache.shiro.subject.Subject subject = org.apache.shiro.SecurityUtils.getSubject();
    org.recap.model.userManagement.UserDetailsForm userDetailsForm = org.recap.security.UserManagement.getRequestAccess(subject);
    org.recap.model.search.BibliographicMarcForm bibliographicMarcForm = marcRecordViewUtil.buildBibliographicMarcForm(bibId, null, userDetailsForm);
    model.addAttribute("bibliographicMarcForm", bibliographicMarcForm);
    if ((null != bibliographicMarcForm) && (org.apache.commons.lang3.StringUtils.isNotBlank(bibliographicMarcForm.getErrorMessage()))) {
        return "marcRecordErrorMessage";
    }else {
        return "marcRecordView";
    }
}