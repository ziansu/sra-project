@org.springframework.web.bind.annotation.RequestMapping(value = { "/newbie/save" })
public org.springframework.web.servlet.ModelAndView newbieSave(@org.springframework.web.bind.annotation.RequestParam(required = true)
java.lang.String loginName, @org.springframework.web.bind.annotation.RequestParam(required = true)
java.lang.String displayName, org.springframework.ui.ModelMap map) {
    svcBean.createPerson(loginName, displayName, false);
    expireCache();
    return new org.springframework.web.servlet.ModelAndView("redirect:/my/");
}