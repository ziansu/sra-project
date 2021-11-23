void setFlag(java.util.List<java.lang.String> flag) {
    int numberi = java.lang.Integer.parseInt(flag.get(0));
    int numberj = java.lang.Integer.parseInt(flag.get(1));
    java.lang.String testField = field.getUserFieldSimple(numberi, numberj);
    if (testField.equals("x"))
        field.setFlag(numberi, numberj);
    
}