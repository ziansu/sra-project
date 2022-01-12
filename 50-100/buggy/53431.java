@org.springframework.web.bind.annotation.ExceptionHandler(value = java.lang.Throwable.class)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
public java.lang.String exception(final java.lang.Throwable throwable, final org.springframework.ui.Model model) {
    log.error("Exception during execution of SpringSecurity application", throwable);
    java.lang.System.out.println("Is that work ? exception");
    java.lang.String errorMessage = (throwable != null) ? throwable.getMessage() : "Unknown error";
    model.addAttribute("errorMessage", errorMessage);
    return "error";
}