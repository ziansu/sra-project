public static havabol.ResultValue logicalNot(havabol.ResultValue op1, havabol.Parser parser) {
    havabol.ResultValue res = new havabol.ResultValue();
    res.setType(Token.BOOLEAN);
    res.setStructure(STIdentifier.PRIMITIVE);
    if (op1.getValue().equals("T")) {
        res.setValue("F");
    }
    if (op1.getValue().equals("F")) {
        res.setValue("T");
    }
    return res;
}