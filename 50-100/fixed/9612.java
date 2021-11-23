@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String home(java.util.Locale locale, org.springframework.ui.Model model) {
    java.util.Date date = new java.util.Date();
    java.text.DateFormat dateFormat = java.text.DateFormat.getDateTimeInstance(java.text.DateFormat.LONG, java.text.DateFormat.LONG, locale);
    java.lang.String formattedDate = dateFormat.format(date);
    model.addAttribute("serverTime", formattedDate);
    return "index";
}