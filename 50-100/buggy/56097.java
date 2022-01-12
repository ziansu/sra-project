public void logIssue(int tag, int level, org.jdom2.Element xmlElement, java.lang.String msg, java.lang.String explanation, com.movielabs.mddflib.logging.LogReference srcRef, java.lang.String moduleId) {
    java.lang.Object target = null;
    if ((pedigreeMap) == null) {
        target = xmlElement;
    }else {
        com.movielabs.mddflib.avails.xml.Pedigree ped = pedigreeMap.get(xmlElement);
        if (ped != null) {
            target = ped.getSource();
        }
    }
    loggingMgr.logIssue(tag, level, target, msg, explanation, srcRef, moduleId);
}