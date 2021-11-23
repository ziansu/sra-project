@org.springframework.web.bind.annotation.RequestMapping(value = "/properties/proxy/edit", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String editProxyServers(@org.springframework.validation.annotation.Validated
vms.models.ProxyServer proxyServer, org.springframework.validation.BindingResult bindingResult, @org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.Long id, @org.springframework.web.bind.annotation.RequestParam(value = "login")
java.lang.String login, @org.springframework.web.bind.annotation.RequestParam(value = "password")
java.lang.String password, @org.springframework.web.bind.annotation.RequestParam(value = "token")
java.lang.String token, @org.springframework.web.bind.annotation.RequestParam(value = "ip")
java.lang.String ip, @org.springframework.web.bind.annotation.RequestParam(value = "port")
java.lang.Long port) {
    if (bindingResult.hasErrors()) {
        return "redirect:/properties/proxy?hasNull";
    }
    vms.models.ProxyServer server = new vms.models.ProxyServer(id, login, password, token, ip, port);
    try {
        proxyServerService.editProxyServer(server);
    } catch (java.lang.Exception exp) {
        return "redirect:/properties/proxy?duplicate";
    }
    return "redirect:/properties/proxy";
}