private java.lang.String inferReplacementType(java.lang.String entry) {
    if (isXML(entry, true)) {
        return org.apache.synapse.mediators.transform.PayloadFactoryMediator.XML_TYPE;
    }else
        if (isJson(entry)) {
            return org.apache.synapse.mediators.transform.PayloadFactoryMediator.JSON_TYPE;
        }else
            if (!(isJson(entry))) {
                return org.apache.synapse.mediators.transform.PayloadFactoryMediator.STRING_TYPE;
            }else {
                return org.apache.synapse.mediators.transform.PayloadFactoryMediator.STRING_TYPE;
            }
        
    
}