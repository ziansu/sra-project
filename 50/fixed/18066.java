@org.springframework.messaging.handler.annotation.MessageMapping(value = "add")
@org.springframework.messaging.handler.annotation.SendTo(value = "/response/operation")
@org.springframework.web.bind.annotation.ResponseBody
public ru.antowka.stock.model.Operation addOperation(@org.springframework.web.bind.annotation.ModelAttribute
ru.antowka.stock.model.Operation operation) throws java.lang.Exception {
    return operationService.addOperation(operation);
}