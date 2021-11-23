private static boolean thisFileColumnHasFilesReferenced(java.lang.String fileColumn, java.util.List<java.util.List<java.lang.String>> tableData) {
    int index = uk.ac.ebi.metabolights.repository.model.studyvalidator.groups.AssayValidations.indexToCheck(fileColumn);
    for (java.util.List<java.lang.String> data : tableData) {
        if (data.get(index).isEmpty()) {
            return false;
        }
    }
    return true;
}