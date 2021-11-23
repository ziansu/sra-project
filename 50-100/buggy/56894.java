@org.springframework.web.bind.annotation.RequestMapping(value = "/editCity", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView editCity(javax.servlet.http.HttpServletRequest request) {
    long cityId = java.lang.Long.parseLong(request.getParameter("id"));
    hr.fer.croz.app.model.City city = contactDAO.getCity(cityId);
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView("CityForm");
    model.addObject("city", city);
    return model;
}