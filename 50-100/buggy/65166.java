@org.springframework.web.bind.annotation.RequestMapping(value = "/saveContact", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView saveContact(@javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute
hr.fer.croz.app.model.Contact contact, org.springframework.validation.BindingResult result) {
    org.springframework.web.servlet.ModelAndView model;
    if (result.hasErrors()) {
        model = new org.springframework.web.servlet.ModelAndView("ContactForm", result.getModel());
    }else {
        if (contact == null) {
            this.contact = contact;
        }
        hr.fer.croz.app.model.Sex sex = hr.fer.croz.app.model.Sex.getInstance();
        model = new org.springframework.web.servlet.ModelAndView("GenderForm", "sex", sex);
    }
    return model;
}