private float findAvailableSeed() {
    if ((usedSeeds_) == null)
        return -1;
    
    int i = 0;
    while (usedSeeds_[seedStack_.get(i).objA_][seedStack_.get(i).objB_]) {
        i++;
        if (i >= (seedStack_.size()))
            return -1;
        
    } 
    row_ = seedStack_.get(i).objB_;
    column_ = seedStack_.get(i).objA_;
    return weightGrid_[column_][row_];
}