public void skipWhite() throws de.hhu.propra16.project7.catalogue.ParseException {
    if (!(endReached())) {
        while (isWhite())
            proceed();
        
    }
}