public edu.chl.proton.model.Document createDocument(edu.chl.proton.model.DocumentType documentType) {
    if (documentType == null) {
        return null;
    }
    if (documentType == (DocumentType.PLAIN)) {
    }else
        if (documentType == (DocumentType.MARKDOWN)) {
            return new edu.chl.proton.model.Markdown(file);
        }else
            if (documentType == (DocumentType.SLIDE)) {
            }else
                if (documentType == (DocumentType.ASSIGNMENT)) {
                }
            
        
    
    return null;
}