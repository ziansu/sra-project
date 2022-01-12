private org.mycore.mets.model.MCRMETSDefaultGenerator.FileUse getFileUse(final java.lang.String href) {
    if (href.startsWith(("tei/" + (org.mycore.mets.model.MCRMETSDefaultGenerator.TRANSLATION)))) {
        return org.mycore.mets.model.MCRMETSDefaultGenerator.FileUse.TRANSLATION;
    }else
        if (href.startsWith(("tei/" + (org.mycore.mets.model.MCRMETSDefaultGenerator.TRANSCRIPTION)))) {
            return org.mycore.mets.model.MCRMETSDefaultGenerator.FileUse.TRANSCRIPTION;
        }else
            if (href.startsWith("alto/")) {
                return org.mycore.mets.model.MCRMETSDefaultGenerator.FileUse.ALTO;
            }
        
    
    return org.mycore.mets.model.MCRMETSDefaultGenerator.FileUse.MASTER;
}