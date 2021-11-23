private int getOperation(java.lang.String operation) {
    if ((operation.indexOf(' ')) != (-1)) {
        operation = operation.substring(0, operation.indexOf(' '));
    }
    operation = operation.trim();
    switch (operation) {
        case "add" :
            return Paser.BasicPaser.OPERATION_ADD;
        case "delete" :
            return Paser.BasicPaser.OPERATION_DELETE;
        case "display" :
            return Paser.BasicPaser.OPERATION_DISPLAY;
        case "clear" :
            return Paser.BasicPaser.OPERATION_CLEAR;
        case "exit" :
            return Paser.BasicPaser.OPERATION_EXIT;
        default :
            return Paser.BasicPaser.OPERATION_UNKNOWN;
    }
}