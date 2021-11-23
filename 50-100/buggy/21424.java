private void findNext() {
    if (over())
        return ;
    
    if (((idxNext) != (NOT_INITIALIZED)) && ((idx) != (idxNext)))
        return ;
    
    while (((idx) < (size())) && (!(zero(get(idx)))))
        (idx)++;
    
    idxNext = (idx)++;
}