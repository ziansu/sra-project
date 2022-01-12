public com.epam.indigo.IndigoObject createDecomposer(com.epam.indigo.IndigoObject scaffold) {
    setSessionID();
    java.lang.Object[] guard = new java.lang.Object[]{ this , scaffold };
    int res = com.epam.indigo.Indigo.checkResult(guard, com.epam.indigo.Indigo._lib.indigoCreateDecomposer(scaffold.self));
    if (res == 0)
        return null;
    
    return new com.epam.indigo.IndigoObject(this, res);
}