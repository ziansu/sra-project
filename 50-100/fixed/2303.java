@org.springframework.web.bind.annotation.RequestMapping(value = "/vk/sign")
public java.lang.String vksign(javax.servlet.http.HttpServletRequest request) {
    java.lang.String code = request.getParameter("code");
    if (code != null) {
        net.de1mos.jbox.api.client.vk.core.VKAuthToken token = apiClient.getOAuthToken(code);
        net.de1mos.jbox.api.client.vk.core.VKUser user = apiClient.getCurrentVKUserInfo(token);
        request.getSession().setAttribute("VK_USER", user);
        return "redirect:/hello";
    }else {
        return "redirect:" + (apiClient.getAuthURL(net.de1mos.jbox.webclient.controllers.HelloController.vkApiScope));
    }
}