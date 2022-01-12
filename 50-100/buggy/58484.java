private int findIntervalDistance(edu.stanford.nlp.util.Interval<java.lang.Integer> intr1, edu.stanford.nlp.util.Interval<java.lang.Integer> intr2) {
    int order = intr1.compareIntervalOrder(intr2);
    if (order == (-1)) {
        return (intr1.first()) - (intr2.second());
    }else
        if (order == 1) {
            return (intr2.first()) - (intr1.second());
        }else {
            return -1;
        }
    
}