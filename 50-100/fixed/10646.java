public com.epam.indigo.IndigoObject exactMatch(com.epam.indigo.IndigoObject obj1, com.epam.indigo.IndigoObject obj2, java.lang.String flags) {
    if (flags == null)
        flags = "";
    
    com.epam.indigo.IndigoObject[] parent = new com.epam.indigo.IndigoObject[]{ obj1 , obj2 };
    setSessionID();
    int match = com.epam.indigo.Indigo.checkResult(this, parent, com.epam.indigo.Indigo._lib.indigoExactMatch(obj1.self, obj2.self, flags));
    if (match == 0)
        return null;
    
    return new com.epam.indigo.IndigoObject(this, match, parent);
}