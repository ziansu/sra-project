@org.springframework.web.bind.annotation.RequestMapping(value = "/delete")
public org.springframework.web.servlet.ModelAndView helloWorld(@org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.String id, @org.springframework.web.bind.annotation.CookieValue(value = "personid", defaultValue = "")
java.lang.String personIdInCookie) {
    if (!(personIdInCookie.equals(""))) {
        personService.deleltePerson(id);
        return new org.springframework.web.servlet.ModelAndView("redirect:/hello");
    }else {
        return new org.springframework.web.servlet.ModelAndView("login");
    }
}