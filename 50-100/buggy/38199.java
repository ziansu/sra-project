private org.mycore.mets.model.MCRMETSDefaultGenerator.FileUse getFileUse(final java.lang.String href) {
    if (href.startsWith(("tei/" + (org.mycore.mets.model.MCRMETSDefaultGenerator.TRANSLATION))))
        return org.mycore.mets.model.MCRMETSDefaultGenerator.FileUse.TRANSLATION;
    
    if (href.startsWith(("tei/" + (org.mycore.mets.model.MCRMETSDefaultGenerator.TRANSCRIPTION))))
        return org.mycore.mets.model.MCRMETSDefaultGenerator.FileUse.TRANSCRIPTION;
    
    if (href.startsWith("alto/"))
        return org.mycore.mets.model.MCRMETSDefaultGenerator.FileUse.ALTO;
    
    return org.mycore.mets.model.MCRMETSDefaultGenerator.FileUse.MASTER;
}