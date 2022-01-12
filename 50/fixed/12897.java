public java.lang.Process remove() {
    java.lang.Process c = getCurrent();
    if ((size()) > 0)
        setCurrent(((java.lang.Process) (ioQueue.removeNext())));
    else
        setCurrent(null);
    
    return c;
}