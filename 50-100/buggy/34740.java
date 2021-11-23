public float similarity(com.epam.indigo.IndigoObject obj1, com.epam.indigo.IndigoObject obj2, java.lang.String metrics) {
    if (metrics == null)
        metrics = "";
    
    setSessionID();
    java.lang.Object[] guard = new java.lang.Object[]{ this , obj1 , obj2 };
    return com.epam.indigo.Indigo.checkResultFloat(guard, com.epam.indigo.Indigo._lib.indigoSimilarity(obj1.self, obj2.self, metrics));
}