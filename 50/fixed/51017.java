public void skipWhite() throws de.hhu.propra16.project7.catalogue.ParseException {
    while ((!(endReached())) && (isWhite()))
        proceed();
    
}