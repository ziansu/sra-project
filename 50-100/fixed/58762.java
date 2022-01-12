public static void p3() throws java.lang.Exception {
    if (LR1.useMethod)
        throw new java.lang.Exception("Error, no method available at phase 3");
    
    switch (LR1.tokens.get(LR1.index)) {
        case "+" :
            LR1.reduceSingleStackTop("T", "F");
            break;
        case "*" :
            LR1.reduceSingleStackTop("T", "F");
            break;
        case ")" :
            LR1.reduceSingleStackTop("T", "F");
            break;
        case "$" :
            LR1.reduceSingleStackTop("T", "F");
            break;
        default :
            throw LR1.throwSyntaxException();
    }
}