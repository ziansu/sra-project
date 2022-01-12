public static void p1() throws java.lang.Exception {
    if (LR1.useMethod)
        throw new java.lang.Exception("Error, no method available at phase 1");
    
    switch (LR1.tokens.get(LR1.index)) {
        case "+" :
            LR1.pushPhaseAndIncrement(6);
            break;
        case "$" :
            LR1.acceptAnswer = true;
            break;
        default :
            LR1.throwSyntaxException();
    }
}