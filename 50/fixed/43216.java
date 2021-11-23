public int setSGroupDataType(java.lang.String data_type) {
    if (data_type == null)
        data_type = "";
    
    dispatcher.setSessionID();
    return com.epam.indigo.Indigo.checkResult(this, _lib.indigoSetSGroupDataType(self, data_type));
}