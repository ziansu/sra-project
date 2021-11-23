public void setLimit(int limit) {
    if (limit <= 0)
        throw new java.lang.IllegalArgumentException("Limit cannot be negative.");
    
    if (limit = balance)
        throw new java.lang.IllegalArgumentException("Limit cannot be greater than balance.");
    
    this.limit = limit;
}