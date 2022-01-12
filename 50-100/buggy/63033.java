@org.springframework.web.bind.annotation.RequestMapping(value = "/" + (ua.com.vertex.controllers.CertificateDetailsPageController.CERTIFICATE_DETAILS))
public java.lang.String showCertificateDetailsPage(org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    java.lang.String returnPage = ua.com.vertex.controllers.CertificateDetailsPageController.CERTIFICATE_DETAILS;
    try {
        javax.servlet.http.HttpSession session = request.getSession();
        storage.setSessionId(session.getId());
        model.addAttribute("newCertificate", new ua.com.vertex.beans.Certificate());
    } catch (java.lang.Throwable t) {
        ua.com.vertex.controllers.CertificateDetailsPageController.LOGGER.error(storage.getId(), t, t);
        returnPage = ua.com.vertex.controllers.CertificateDetailsPageController.ERROR;
    }
    return returnPage;
}