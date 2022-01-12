public int commonBits(com.epam.indigo.IndigoObject fingerprint1, com.epam.indigo.IndigoObject fingerprint2) {
    java.lang.Object[] guard = new java.lang.Object[]{ this , fingerprint1 , fingerprint2 };
    setSessionID();
    return com.epam.indigo.Indigo.checkResult(guard, com.epam.indigo.Indigo._lib.indigoCommonBits(fingerprint1.self, fingerprint2.self));
}