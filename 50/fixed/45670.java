public void onEndFormalCall(symboltable.Symbol callLocation) {
    w.writeLine((("PUSH -1(D" + ((callLocation.nestinglevel) + 1)) + ")"));
    w.writeLine("RET");
}