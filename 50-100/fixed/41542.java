public boolean hasErrors(org.springframework.ui.Model model) {
    lombok.val errors = model.asMap().get(com.sample.web.base.WebConst.MAV_ERRORS);
    if ((errors != null) && (errors instanceof org.springframework.validation.BeanPropertyBindingResult)) {
        lombok.val br = ((org.springframework.validation.BeanPropertyBindingResult) (errors));
        if (br.hasErrors()) {
            return true;
        }
    }
    return false;
}