public int compareTo(Experiment.MTreeNode other) {
    if (other == null)
        return 1;
    
    int cmp = java.lang.Double.compare(utility(), other.utility());
    if (cmp != 0)
        return cmp;
    
    cmp = java.lang.Double.compare(lower, other.lower);
    if (cmp != 0)
        return cmp;
    
    cmp = java.lang.Double.compare(upper, other.upper);
    if (cmp != 0)
        return cmp;
    
    return java.lang.Double.compare(visits, other.visits);
}