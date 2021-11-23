public int reactingCenter(com.epam.indigo.IndigoObject bond) {
    com.sun.jna.ptr.IntByReference res = new com.sun.jna.ptr.IntByReference();
    dispatcher.setSessionID();
    if ((com.epam.indigo.Indigo.checkResult(this, bond, _lib.indigoGetReactingCenter(self, bond.self, res))) == 1)
        return res.getValue();
    
    throw new com.epam.indigo.IndigoException(this, "reactingCenter(): unexpected result");
}