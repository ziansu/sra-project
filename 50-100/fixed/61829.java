private int scanSepearator() {
    switch (currentChar) {
        case '{' :
            takeIt();
            return MiniC.Scanner.Token.LEFTBRACE;
        case '}' :
            takeIt();
            return MiniC.Scanner.Token.RIGHTBRACE;
        case '(' :
            takeIt();
            return MiniC.Scanner.Token.LEFTPAREN;
        case ')' :
            takeIt();
            return MiniC.Scanner.Token.RIGHTPAREN;
        case '[' :
            takeIt();
            return MiniC.Scanner.Token.LEFTBRACKET;
        case ']' :
            takeIt();
            return MiniC.Scanner.Token.RIGHTBRACKET;
        case ';' :
            takeIt();
            return MiniC.Scanner.Token.SEMICOLON;
        default :
            takeIt();
            return MiniC.Scanner.Token.ERROR;
    }
}