public trinity.types.FunctionType getCurrentFunction() {
    try {
        return ((trinity.types.FunctionType) (retrieveSymbol("##func")));
    } catch (trinity.CustomExceptions.SymbolNotFoundException e) {
        e.printStackTrace();
    }
    return null;
}