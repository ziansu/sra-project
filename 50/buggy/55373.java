public descarteinterpreter.ProgNode buildTestTree2() {
    descarteinterpreter.TokenPair tokenPair = new descarteinterpreter.TokenPair(";", 1);
    descarteinterpreter.ProgNode prog = new descarteinterpreter.ProgNode(30);
    prog.addChild(31);
    prog.addChild(0);
    return prog;
}