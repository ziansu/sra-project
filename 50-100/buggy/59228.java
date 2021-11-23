public int setItemOrder() {
    switch (stateOrder) {
        default :
            java.lang.System.out.println("OK");
            stateOrder = com.example.personale.noteexam.controller.utilities.Field.ORDER_DESC;
        case com.example.personale.noteexam.controller.utilities.Field.ORDER_DESC :
            adapter.order(stateOrder);
            stateOrder = com.example.personale.noteexam.controller.utilities.Field.ORDER_ASC;
            break;
        case com.example.personale.noteexam.controller.utilities.Field.ORDER_ASC :
            adapter.order(stateOrder);
            stateOrder = com.example.personale.noteexam.controller.utilities.Field.ORDER_DESC;
            break;
    }
    return stateOrder;
}