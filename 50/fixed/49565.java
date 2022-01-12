public boolean isExhausted() {
    if (((this.getCounters().getFirst().getCounter()) + 1) >= ((java.lang.Integer.MAX_VALUE) - 1))
        return true;
    else
        return false;
    
}