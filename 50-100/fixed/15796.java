public void push(final char pcBlock) throws java.lang.Exception {
    (accessCounter)++;
    if ((iTop) < (iSize)) {
        if (isEmpty())
            this.acStack[(++(this.iTop))] = acStack[0];
        else
            this.acStack[(++(this.iTop))] = pcBlock;
        
    }else
        throw new common.MyException("Stack is full");
    
}