boolean conditionIsTrue(utilties.models.Game game) {
    int data1 = getData(this.data1, game);
    int data2 = getData(this.data2, game);
    switch (this.operator) {
        case LESS_THAN :
            return data1 < data2;
        case GREATER_THAN :
            return data1 > data2;
        case LESS_THAN_OR_EQUAL_TO :
            return data1 <= data2;
        case GREATER_THAN_OR_EQUAL_TO :
            return data1 >= data2;
        case EQUALS :
            return data1 == data2;
        default :
            return false;
    }
}