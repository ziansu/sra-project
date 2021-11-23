public void multiply(Variable other) {
    if (((other.type) == (ZpmVariableType.STRING)) || ((type) == (ZpmVariableType.STRING))) {
        new ZpmVariableTypeError("Multiplication is undefined for strings");
    }else {
        subtract(other.intValue);
    }
}