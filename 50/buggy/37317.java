public T pop() throws java.lang.Exception {
    if ((count) >= (-1))
        return ((T) (stackArr[((count)--)].getValue()));
    else
        throw new java.lang.Exception("No more elements to pop!");
    
}