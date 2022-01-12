boolean conditionIsTrue(utilties.models.Game game, int id) {
    int data1 = getData(this.data1, game, id);
    int data2 = getData(this.data2, game, id);
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