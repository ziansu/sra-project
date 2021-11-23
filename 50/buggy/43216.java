public int setSGroupDataType(java.lang.String data_type) {
    dispatcher.setSessionID();
    if (data_type == null)
        data_type = "";
    
    return com.epam.indigo.Indigo.checkResult(this, _lib.indigoSetSGroupDataType(self, data_type));
}