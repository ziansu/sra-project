@org.springframework.web.bind.annotation.RequestMapping(value = "/processEnquiry.html")
public java.lang.String processEnquiry(net.bloodbanking.dto.EnquiryFormDTO enquiryFormDTO, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.util.Map<java.lang.String, java.lang.Object> map) {
    try {
        loginService.processEnquiry(enquiryFormDTO);
        enquiryFormDTO = new net.bloodbanking.dto.EnquiryFormDTO();
        enquiryFormDTO.setMessage("Thank you. We will get back to you.");
    } catch (net.bloodbanking.exception.NhanceApplicationException e) {
        handleApplicationExceptionForJson(enquiryFormDTO, e);
    }
    return enquiry(enquiryFormDTO, request, response, map);
}