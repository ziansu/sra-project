@org.springframework.web.bind.annotation.ExceptionHandler(value = com.xkamil.handlers.exceptions.BadRequestException.class)
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.BAD_REQUEST)
public com.xkamil.handlers.Message handle(com.xkamil.handlers.exceptions.BadRequestException ex) {
    return new com.xkamil.handlers.Message(ex.getMessage());
}