public boolean checkOperation(main.ru.konstpavlov.operations.ExchangeOperation operation) {
    return operationMap.containsKey(operation.getOrder());
}