@ru.znamenka.controller.page.PostMapping(path = "club-client")
public org.springframework.http.ResponseEntity<ru.znamenka.represent.domain.TrainingApi> bookTraining(@javax.validation.Valid
ru.znamenka.represent.domain.TrainingApi training, org.springframework.validation.BindingResult bindingResult) {
    if (!(bindingResult.hasErrors())) {
        training = service.save(training);
        eventService.postToCalendar(training);
        return ok(training);
    }
    return badRequest().body(training);
}