public void transform(com.epam.indigo.IndigoObject reaction, com.epam.indigo.IndigoObject monomer) {
    setSessionID();
    java.lang.Object[] guard = new java.lang.Object[]{ this , reaction , monomer };
    com.epam.indigo.Indigo.checkResult(guard, com.epam.indigo.Indigo._lib.indigoTransform(reaction.self, monomer.self));
}