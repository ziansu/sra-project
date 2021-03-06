@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.BAD_REQUEST)
@org.springframework.web.bind.annotation.ExceptionHandler(value = net.identio.server.exceptions.ValidationException.class)
public net.identio.server.model.api.ApiErrorResponse handleValidationException(net.identio.server.exceptions.ValidationException e) {
    return new net.identio.server.model.api.ApiErrorResponse("error.validation", e.getMessage());
}