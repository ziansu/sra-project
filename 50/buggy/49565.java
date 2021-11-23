public boolean isExhausted() {
    if (((this.getCounters().getFirst().getCounter()) + 1) >= (java.lang.Integer.MAX_VALUE))
        return true;
    else
        return false;
    
}