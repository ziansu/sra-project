@org.springframework.web.bind.annotation.RequestMapping(value = "/create", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView create(@javax.validation.Valid
org.sample.controller.pojos.SignupForm signupForm, org.springframework.validation.BindingResult result, javax.servlet.http.HttpServletRequest request, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView("signUp");
    if (!(result.hasErrors())) {
        model = checkValidityAndRegistersNewUser(signupForm, redirectAttributes, model);
        model = authenticateUserAndSetSession(signupForm, request, redirectAttributes, model);
    }else {
        model = new org.springframework.web.servlet.ModelAndView("signUp");
    }
    return model;
}