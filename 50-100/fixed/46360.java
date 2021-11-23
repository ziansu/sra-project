public boolean tryInitValue(int initValue) {
    if (initValuesTried[(initValue - 1)])
        return false;
    
    initValuesTried[(initValue - 1)] = true;
    if (((row.hasValue(initValue)) || (column.hasValue(initValue))) || (zone.hasValue(initValue)))
        return false;
    
    visited = true;
    update(initValue);
    return true;
}