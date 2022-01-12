@org.junit.Test
public void testDefaultChangeTypeToVCSType() {
    for (org.eclipse.jgit.diff.DiffEntry.ChangeType ct : DiffEntry.ChangeType.values()) {
        if (((ct != (DiffEntry.ChangeType.ADD)) && (ct != (DiffEntry.ChangeType.DELETE))) && (ct != (DiffEntry.ChangeType.MODIFY))) {
            assertEquals(git.gitChangeTypeToVCSChangeType(ct), VCSChangeType.UNKNOWN);
        }
    }
}