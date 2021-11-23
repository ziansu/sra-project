@com.github.rmnasri.controller.RequestMapping(value = "/recette/save", method = RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView saveRecette(@javax.validation.Valid
@com.github.rmnasri.controller.ModelAttribute(value = "recetteForm")
com.github.rmnasri.controller.RecetteForm recetteForm, org.springframework.validation.BindingResult result) {
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("welcome");
    if (result.hasErrors()) {
        com.github.rmnasri.controller.WelcomeController.LOGGER.debug("Error has occured when validating Recette Form!");
        return mav;
    }else {
        com.github.rmnasri.model.Recette recetteModel = mapRecette(recetteForm);
        com.github.rmnasri.model.Recette recetteSaved = recetteService.saveRecette(recetteModel);
        com.github.rmnasri.controller.WelcomeController.LOGGER.info("Recette saved :: {}", recetteSaved);
        addCommonDataToMav(mav);
    }
    return mav;
}