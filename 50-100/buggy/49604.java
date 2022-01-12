@org.junit.Test
public void emptyFilesAreNeverSeenAsDuplicates() {
    s1 = s1.addEmptyFiles("empty_file_01");
    s2 = s1.addEmptyFiles("empty_file_02");
    org.fim.model.CompareResult result = new org.fim.internal.StateComparator(context, s1, s2).compare();
    assertGotOnlyModifications(result, org.fim.model.Modification.added);
    assertFilesModified(result, org.fim.model.Modification.added, "empty_file_02");
}