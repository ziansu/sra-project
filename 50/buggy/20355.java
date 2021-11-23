@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.View login(javax.servlet.http.HttpServletResponse response, org.springframework.web.servlet.ModelAndView modelAndView, org.springframework.web.context.request.WebRequest webRequest) throws java.io.IOException, java.net.URISyntaxException {
    java.lang.String oAuth2AuthirizationUrl = imcode.services.utils.IvisOAuth2Utils.getOAuth2AuthirizationUrl(client, redirectUrl, false);
    return new org.springframework.web.servlet.view.RedirectView(oAuth2AuthirizationUrl, false);
}