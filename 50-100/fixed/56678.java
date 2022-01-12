boolean parseArguments() {
    if (!(tokenCheck("("))) {
        return false;
    }
    if (!(currentIs(net.masterthought.dlanguage.parser.DLangParser.tok(")"))))
        if (!(parseNodeQ("node.argumentList", "ArgumentList"))) {
            return false;
        }
    
    if (!(tokenCheck(")"))) {
        return false;
    }
    return true;
}