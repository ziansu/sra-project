private void detectAndAssertRenamedFiles() {
    result = new org.fim.internal.StateComparator(context, s1, s2).compare();
    if ((hashMode) == (org.fim.model.HashMode.dontHash)) {
        assertGotOnlyModifications(result, org.fim.model.Modification.added, org.fim.model.Modification.deleted);
        assertFilesModified(result, org.fim.model.Modification.added, "new_file_01", "new_dup_file_01");
        assertFilesModified(result, org.fim.model.Modification.deleted, "file_01", "dup_file_01");
    }else {
        assertGotOnlyModifications(result, org.fim.model.Modification.renamed);
        assertFilesModified(result, org.fim.model.Modification.renamed, new org.fim.tooling.FileNameDiff("dup_file_01", "new_file_01"), new org.fim.tooling.FileNameDiff("dup_file_01", "new_dup_file_01"));
    }
}