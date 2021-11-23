public descarteinterpreter.ProgNode buildTestTree1() {
    new descarteinterpreter.TokenPair(".", 0);
    descarteinterpreter.ProgNode prog = new descarteinterpreter.ProgNode(30);
    prog.addChild(31);
    prog.addChild(0);
    return prog;
}