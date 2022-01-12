@org.junit.Test
public void is_same_as_when_both_changelogs_have_classpath_prefix() throws java.lang.Exception {
    liquibase.changelog.RanChangeSet ranChangeSet = new liquibase.changelog.RanChangeSet("classpath:/db/file.log", "1", "author", null, null, null, null, null, null, null, null, null);
    liquibase.changelog.ChangeSet incomingChangeSet = new liquibase.changelog.ChangeSet("1", "author", false, false, "classpath:/db/file.log", null, null, null);
    assertTrue(ranChangeSet.isSameAs(incomingChangeSet));
}