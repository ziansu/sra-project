@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteCountry", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView deleteCountry(javax.servlet.http.HttpServletRequest request, org.springframework.ui.ModelMap map) {
    long countryId = java.lang.Long.parseLong(request.getParameter("id"));
    int status = contactDAO.deleteCountry(countryId);
    if (status == 1) {
        map.addAttribute("errMsg", "Cannot delete Country. There exists at least one city that depends on the city");
    }
    return new org.springframework.web.servlet.ModelAndView("redirect:/");
}