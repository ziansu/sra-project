public boolean checkOperation(main.ru.konstpavlov.operations.ExchangeOperation operation) {
    if (operationMap.containsKey(operation.getOrder())) {
        return true;
    }else {
        return false;
    }
}