public scanner.Node stmt_sequence(scanner.Node p) {
    scanner.Node n = new scanner.Node(p, "stmt_sequence");
    n.addChild(statement(n));
    while ((scanOut.get(index).getR()) == (Scanner.TokenType.SEMICOLON)) {
        match(Scanner.TokenType.SEMICOLON);
        if ((index) >= (scanOut.size()))
            break;
        
        n.addChild(statement(n));
    } 
    return n;
}