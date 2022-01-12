public boolean hasRelation(java.lang.String ratee, java.lang.String rater) throws DatabaseController.DALException {
    if ((!(ratee.isEmpty())) && (!(rater.isEmpty())))
        return true;
    else
        return false;
    
}