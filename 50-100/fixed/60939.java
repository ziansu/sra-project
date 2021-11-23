public static void p2() throws java.lang.Exception {
    if (LR1.useMethod)
        throw new java.lang.Exception("Error, no method available at phase 2");
    
    switch (LR1.tokens.get(LR1.index)) {
        case "+" :
            LR1.reduceSingleStackTop("E", "T");
            break;
        case "*" :
            LR1.pushPhaseAndIncrement(7);
            break;
        case ")" :
            LR1.reduceSingleStackTop("E", "T");
            break;
        case "$" :
            LR1.reduceSingleStackTop("E", "T");
            break;
        default :
            throw LR1.throwSyntaxException();
    }
}