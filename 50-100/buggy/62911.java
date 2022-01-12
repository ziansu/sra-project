public org.springframework.validation.Errors getValidationError() {
    org.springframework.validation.Errors errors = new org.springframework.validation.DirectFieldBindingResult(this, "buyFundForm");
    if (((amount) != null) && ((amount) < 0.01))
        errors.rejectValue("amount", "", com.team11.mutualfund.utils.Constant.TOOLITTLEAMOUNT);
    
    if ((((amount) != null) && ((available) != null)) && ((amount) < (available)))
        errors.rejectValue("amount", "", com.team11.mutualfund.utils.Constant.NOENOUGHCASH);
    
    return errors;
}