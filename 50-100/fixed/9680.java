private test.Type visitType(test.TypeContext type) {
    if (type.getText().equals("int")) {
        return new test.IntegerType();
    }else
        if (type.getText().equals("boolean")) {
            return new test.BooleanType();
        }
    
    return null;
}