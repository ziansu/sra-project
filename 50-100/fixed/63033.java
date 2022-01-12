@org.springframework.web.bind.annotation.RequestMapping(value = "/certificateDetails")
public java.lang.String showCertificateDetailsPage(org.springframework.ui.Model model) {
    java.lang.String returnPage = ua.com.vertex.controllers.CertificateDetailsPageController.CERTIFICATE_DETAILS;
    try {
        model.addAttribute("newCertificate", new ua.com.vertex.beans.Certificate());
    } catch (java.lang.Throwable t) {
        ua.com.vertex.controllers.CertificateDetailsPageController.LOGGER.error(storage.getId(), t, t);
        returnPage = ua.com.vertex.controllers.CertificateDetailsPageController.ERROR;
    }
    return returnPage;
}