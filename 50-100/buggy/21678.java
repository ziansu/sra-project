private int altn() throws java.lang.Exception {
    if ((_position) >= (_len))
        return 0;
    
    if ((clause()) > 0)
        return 1;
    
    if ((_position) >= (_len))
        return 0;
    
    return altn();
}