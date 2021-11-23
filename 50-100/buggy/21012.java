public com.epam.indigo.IndigoObject reactionProductEnumerate(com.epam.indigo.IndigoObject reaction, com.epam.indigo.IndigoObject monomers) {
    setSessionID();
    java.lang.Object[] guard = new java.lang.Object[]{ this , reaction , monomers };
    int res = com.epam.indigo.Indigo.checkResult(guard, com.epam.indigo.Indigo._lib.indigoReactionProductEnumerate(reaction.self, monomers.self));
    if (res == 0)
        return null;
    
    return new com.epam.indigo.IndigoObject(this, res);
}