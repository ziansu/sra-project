@java.lang.Override
public void run() {
    if ((com.unimelb.comp90055.bmAnalysis.umlsAPI.AtomManager.getInstance().getAtomList(((cui) + (language)))) == null) {
        com.unimelb.comp90055.bmAnalysis.umlsAPI.RetrieveAtoms ra = new com.unimelb.comp90055.bmAnalysis.umlsAPI.RetrieveAtoms();
        java.util.List<com.unimelb.comp90055.bmAnalysis.umlsAPI.AtomLite> atomList = ra.retrieveAtomsList(cui, language);
        if (atomList == null)
            com.unimelb.comp90055.bmAnalysis.umlsAPI.AtomManager.getInstance().addAtoms(((cui) + (language)), atomList);
        
    }
}