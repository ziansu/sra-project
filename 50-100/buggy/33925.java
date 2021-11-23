public com.epam.indigo.IndigoObject addDataSGroup(int[] atoms, int[] bonds, java.lang.String description, java.lang.String data) {
    dispatcher.setSessionID();
    if (description == null)
        description = "";
    
    if (data == null)
        data = "";
    
    return new com.epam.indigo.IndigoObject(dispatcher, com.epam.indigo.Indigo.checkResult(this, _lib.indigoAddDataSGroup(self, atoms.length, atoms, bonds.length, bonds, description, data)), this);
}