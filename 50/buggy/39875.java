@org.springframework.web.bind.annotation.RequestMapping(value = "/update", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public com.curus.httpio.response.ResponseBase login(@org.springframework.web.bind.annotation.RequestBody
com.curus.controllers.AccountUpdateRequest request) {
    com.curus.controllers.AccountUpdateService service = new com.curus.controllers.AccountUpdateService(request, com.curus.controllers.AccountController.driver);
    return service.process();
}