public boolean verfiyIntegrity() {
    boolean correct = true;
    int p = firstBlockPointer;
    while ((!correct) || (p != (se.grenby.kollo.constant.PrimitiveConstants.INT_VALUE_FOR_NULL))) {
        correct = isCorrectBlock(p);
        p = nextBlock(p);
    } 
    return correct;
}