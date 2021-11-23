@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    org.deeplearning4j.ui.nearestneighbors.NearestNeighborsQuery that = ((org.deeplearning4j.ui.nearestneighbors.NearestNeighborsQuery) (o));
    if ((numWords) != (that.numWords))
        return false;
    
    return !((word) != null ? !(word.equals(that.word)) : (that.word) != null);
}