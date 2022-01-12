private java.lang.String folderName(org.openrdf.model.URI target) {
    if (reasoner.isTypeOf(target, OWL.CLASS)) {
        return "classes";
    }else
        if (reasoner.isProperty(target)) {
            return "properties";
        }else
            if (reasoner.isTypeOf(target, Schema.Enumeration)) {
                return "individuals";
            }
        
    
    return null;
}