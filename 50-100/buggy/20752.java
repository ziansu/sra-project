public com.epam.indigo.IndigoObject findSGroups(java.lang.String property, java.lang.String value) {
    dispatcher.setSessionID();
    if (property == null)
        property = "";
    
    if (value == null)
        value = "";
    
    return new com.epam.indigo.IndigoObject(dispatcher, com.epam.indigo.Indigo.checkResult(this, _lib.indigoFindSGroups(self, property, value)), this);
}