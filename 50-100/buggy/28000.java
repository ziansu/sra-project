private float findAvailableSeed() {
    if ((usedSeeds_) == null)
        return -1;
    
    int i = 0;
    while (usedSeeds_[seedStack_[i].objA_][seedStack_[i].objB_]) {
        i++;
        if (i >= (seedStack_.length))
            return -1;
        
    } 
    row_ = seedStack_[i].objB_;
    column_ = seedStack_[i].objA_;
    return weightGrid_[column_][row_];
}