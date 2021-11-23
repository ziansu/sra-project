public T pop() throws java.lang.Exception {
    if (!(isEmpty()))
        return ((T) (stackArr[((count)--)].getValue()));
    else
        throw new java.lang.Exception("No more elements to pop!");
    
}