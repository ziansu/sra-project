public boolean isFeeCollected() {
    if ((demand) != null)
        return (demand.getBaseDemand().compareTo(demand.getAmtCollected())) == 0 ? true : false;
    else
        return false;
    
}