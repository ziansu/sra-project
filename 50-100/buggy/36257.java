@org.springframework.web.bind.annotation.RequestMapping(value = "/home/domains_r/{domain_name}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getRunning(@org.springframework.web.bind.annotation.PathVariable
java.lang.String domain_name, org.springframework.ui.ModelMap model) {
    model.addAttribute("domain_name", domain_name);
    java.util.Map<java.lang.String, java.lang.String> info = LSD.getRunningDomainInfo(domain_name);
    model.addAttribute("rd_info", info);
    model.addAttribute("vnc_server", LSD.getIPAddress());
    createVNCFile(info.get("VNCPort"), domain_name);
    return "home/libvirt_r_details";
}