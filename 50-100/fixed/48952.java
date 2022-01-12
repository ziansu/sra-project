@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String home(java.util.Locale locale, org.springframework.ui.Model model, java.security.Principal principal) {
    com.barun.springsecurity.controller.HomeController.logger.info("Welcome home! The client locale is {}.", locale);
    java.util.Date date = new java.util.Date();
    java.text.DateFormat dateFormat = java.text.DateFormat.getDateTimeInstance(java.text.DateFormat.LONG, java.text.DateFormat.LONG, locale);
    java.lang.String formattedDate = dateFormat.format(date);
    model.addAttribute("serverTime", formattedDate);
    return "home";
}