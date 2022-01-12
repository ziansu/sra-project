@org.springframework.web.bind.annotation.RequestMapping(value = "/edit.html", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView edit(@org.springframework.web.bind.annotation.ModelAttribute(value = "id")
java.lang.Integer id) {
    try {
        org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView("admin/drink/drink");
        modelAndView.addObject("drink", drinkService.findById(id));
        modelAndView.addObject("action", "Editer");
        return modelAndView;
    } catch (java.lang.Exception e) {
        return list();
    }
}