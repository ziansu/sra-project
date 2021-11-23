@org.springframework.security.access.prepost.PreAuthorize(value = "hasRole('ROLE_ADMIN')")
@org.springframework.web.bind.annotation.RequestMapping(value = "/settings", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String showSettings(org.springframework.ui.Model model) {
    logger.info("begin: show admin settings");
    model.addAttribute("regMethod", adminSettings.getRegistrationMethod().toString());
    logger.info("end: admin settings are shown");
    return "adminSettings";
}