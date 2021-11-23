@org.springframework.web.bind.annotation.RequestMapping(value = "/support", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String support(java.util.Locale locale, org.springframework.ui.Model model) {
    java.util.Date date = new java.util.Date();
    java.text.DateFormat dateFormat = java.text.DateFormat.getDateTimeInstance(java.text.DateFormat.LONG, java.text.DateFormat.LONG, locale);
    java.lang.String formattedDate = dateFormat.format(date);
    model.addAttribute("serverTime", formattedDate);
    model.addAttribute("pageTitle", "Ayuda");
    return "support";
}