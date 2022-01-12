@org.springframework.web.bind.annotation.PostMapping(value = "/process")
public java.lang.String processForm(@javax.validation.Valid
me.jerilynmensah.bullhorn02.Message message, org.springframework.validation.BindingResult result) {
    if (result.hasErrors()) {
        return "messageform";
    }
    messageRepository.save(message);
    return "redirect:/";
}