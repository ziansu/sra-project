private boolean execute_LIST_SIZE() {
    int listIndex = getListArg();
    if (listIndex == 0)
        return false;
    
    if (!(isNext(',')))
        return false;
    
    if (!(getNVar()))
        return false;
    
    if (!(checkEOL()))
        return false;
    
    int size = com.rfo.basic.Run.theLists.get(listIndex).size();
    com.rfo.basic.Run.NumericVarValues.set(theValueIndex, ((double) (size)));
    return true;
}