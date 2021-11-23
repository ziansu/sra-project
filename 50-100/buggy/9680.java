private test.Type visitType(test.TypeContext type) {
    if ((type.getText()) == "int") {
        return new test.IntegerType();
    }else
        if ((type.getText()) == "boolean") {
            return new test.BooleanType();
        }
    
    return null;
}