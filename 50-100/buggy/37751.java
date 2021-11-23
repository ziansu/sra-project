@com.beerHangout.controllers.RequestMapping(method = RequestMethod.POST)
public void handleRegister(@com.beerHangout.controllers.RequestBody
@org.springframework.validation.annotation.Validated
@javax.validation.Valid
com.beerHangout.models.User user, org.springframework.validation.BindingResult bindingResult, org.springframework.ui.Model model, javax.servlet.http.HttpServletResponse response) {
    if (bindingResult.hasErrors()) {
        com.beerHangout.controllers.RegisterController.logger.warn("Validation of user register not success");
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    }
    com.beerHangout.controllers.RegisterController.logger.info("Validation success");
    model.addAttribute("registeredUser");
    response.setStatus(HttpServletResponse.SC_OK);
}