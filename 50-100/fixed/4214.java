private static int getTopNumber() {
    int intNumber;
    java.lang.String stringNumber;
    stringNumber = Interpreter.commands.peek();
    Interpreter.commands.pop();
    if (Interpreter.commandMap.containsKey(stringNumber)) {
        intNumber = Interpreter.commandMap.get(stringNumber);
    }else {
        intNumber = java.lang.Integer.parseInt(stringNumber);
    }
    return intNumber;
}