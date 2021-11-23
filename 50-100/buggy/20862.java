private java.lang.String cbr(java.lang.String[] input) throws exceptions.TooManyRegistersException {
    java.lang.String[] comma = input[3].split(",");
    addRegister(input[1]);
    return ((("Branch " + (registers.get(input[1]))) + "(Abs ") + (jumps.get(new utils.iloc.model.Label(comma[1])))) + ")";
}