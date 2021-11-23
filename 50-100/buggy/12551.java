@org.springframework.web.bind.annotation.RequestMapping(value = "/sign_in", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String loginRedirect(@org.springframework.web.bind.annotation.ModelAttribute
@javax.validation.Valid
fr.univ.annuaire.beans.Login l, org.springframework.validation.BindingResult result) throws fr.univ.annuaire.dao.DaoException {
    fr.univ.annuaire.manager.LoginManager manager = new fr.univ.annuaire.manager.LoginManager(l);
    if (result.hasErrors()) {
        logger.info("Returning log view, auth failled: incorrect syntax");
        return "login";
    }
    if (!(manager.checkLogin())) {
        logger.info("Returning accueil view, auth success");
        return "redirect:/actions/accueil";
    }
    logger.info("Returning log view, auth failled: wrong identifiants");
    return "login";
}