private java.lang.String addRuleSet(java.io.File f) {
    org.jdom2.Document doc = org.yawlfoundation.yawl.util.JDOMUtil.fileToDocument(f);
    if (doc == null) {
        return "Invalid file content: " + (f.getAbsolutePath());
    }
    org.yawlfoundation.yawl.engine.YSpecificationID specID = getSpecID(doc);
    if (specID != null) {
        return addRuleSet(specID, doc);
    }
    java.lang.String processName = getProcessName(doc);
    if (processName != null) {
        return addRuleSet(processName, doc);
    }
    return "Missing required specification or process attributes in file: " + (f.getAbsolutePath());
}