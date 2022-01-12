@java.lang.Override
public java.lang.String generateQuestionnaires(java.lang.String modelSetId, java.lang.String type, byte[] configurationFile) throws eu.learnpad.exception.impl.LpRestExceptionXWikiImpl {
    java.lang.String genProcessID = null;
    try {
        genProcessID = this.qm.startGeneration(modelSetId);
    } catch (java.lang.Exception e) {
        throw new eu.learnpad.exception.impl.LpRestExceptionXWikiImpl(e);
    }
    return genProcessID;
}