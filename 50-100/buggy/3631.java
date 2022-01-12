public net.sf.memoranda.DefectList openDefectList(net.sf.memoranda.Project project) {
    java.lang.String files = (((net.sf.memoranda.util.FileStorage.JN_DOCPATH) + (project.getID())) + (java.io.File.separator)) + ".defectlist";
    net.sf.memoranda.DefectList defectList = new net.sf.memoranda.DefectListImpl(project);
    if (net.sf.memoranda.util.FileStorage.documentExists(files)) {
        nu.xom.Document defectDocument = net.sf.memoranda.util.FileStorage.openDocument(files);
        defectList = new net.sf.memoranda.DefectListImpl(defectDocument, project);
    }
    return defectList;
}