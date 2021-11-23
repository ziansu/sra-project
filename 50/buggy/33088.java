@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public float calculate(long operandOne, long operandTwo, java.lang.String operator) {
    return operationService.doOperation(operandOne, operandTwo, operator);
}