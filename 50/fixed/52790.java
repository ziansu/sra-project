@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public void addOperation(@org.springframework.web.bind.annotation.RequestBody
com.saeler.dto.operation.OperationAttributesDto operation) throws java.text.ParseException {
    operationsService.createOperation(operation);
}