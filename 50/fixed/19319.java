@org.springframework.security.access.prepost.PreAuthorize(value = "hasAuthority('ADMIN')")
@com.mokon.spring.boot.backend.controller.RequestMapping(value = "/user/create", method = RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView getUserCreatePage(org.springframework.ui.Model model) {
    return new org.springframework.web.servlet.ModelAndView("user_create", "form", new com.mokon.spring.boot.backend.domain.UserCreateForm());
}