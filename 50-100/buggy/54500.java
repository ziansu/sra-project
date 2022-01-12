public static Root parse(java.util.ArrayList<Token> input) {
    Root program = new Root();
    Parser.setInput(input);
    if ((input.size()) > 0) {
        Parser.setCurrentToken(input.get(0));
    }
    while ((Parser.getCurrentToken()) instanceof ProcedureToken) {
        program.getProcs().add(Procedure.parse());
    } 
    return program;
}