public boolean isArrayProperty() {
    if ((myGetMethod) != null) {
        return (myGetMethod.parameters().length) == 1;
    }else
        if ((mySetMethod) != null) {
            return (mySetMethod.parameters().length) == 2;
        }
    
    throw new java.lang.IllegalArgumentException("Not setter and getter");
}