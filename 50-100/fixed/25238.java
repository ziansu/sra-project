@by.itransition.web.PostMapping(value = "/recovery")
@javax.transaction.Transactional
public java.lang.String processRecovery(java.util.Locale locale, @by.itransition.web.ModelAttribute(value = "recoveryForm")
@javax.validation.Valid
by.itransition.data.model.dto.PasswordDto passwordRecovery, @by.itransition.web.RequestParam(value = "token")
java.lang.String token, org.springframework.validation.BindingResult result) {
    if (result.hasErrors())
        return "recovery";
    else {
        final java.util.Optional<by.itransition.data.model.RecoveryToken> optional = userService.findByRecoveryToken(token);
        if (optional.isPresent()) {
            unlockUser(optional.get().getUser(), passwordRecovery, token);
            return "redirect:/login?lang=" + locale;
        }else
            throw new org.elasticsearch.ResourceNotFoundException("No recovery request found");
        
    }
}