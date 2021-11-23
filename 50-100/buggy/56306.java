public edu.chl.proton.model.Document getDocument(java.lang.String documentType) {
    if (documentType == null) {
        return null;
    }
    if (documentType.equalsIgnoreCase("PLAIN")) {
    }else
        if (documentType.equalsIgnoreCase("MARKDOWN")) {
            return new edu.chl.proton.model.Markdown(file);
        }else
            if (documentType.equalsIgnoreCase("SLIDE")) {
            }else
                if (documentType.equalsIgnoreCase("ASSIGNMENT")) {
                }
            
        
    
    return null;
}